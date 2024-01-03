import java.util.* ;
import java.io.*; 
import  java.util.ArrayList;

public class Solution {
    public static boolean isPossible(int[][] adjMatrix, boolean[] visited, int n, int m, int sv, int[] numVisited) {
        if (numVisited[0] == n) return true;

        visited[sv] = true;
        numVisited[0]++;
        boolean ans = true;

        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!visited[i] && adjMatrix[i][sv] == 1) {
                temp.add(i);
            }
        }

        if (temp.size() >= m) {
            if (m == 1) return false;
            else if (m > 2) return true;
            else if (adjMatrix[temp.get(0)][temp.get(1)] == 1) return false;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i] && adjMatrix[i][sv] == 1) {
                ans = ans && isPossible(adjMatrix, visited, n, m, i, numVisited);
            }
        }

        return ans;
    }

    public static String graphColoring(int[][] adjMatrix, int n, int m) {
        boolean[] visited = new boolean[n];
        int[] numVisited = { 0 };
        boolean ans = true;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                ans = ans && isPossible(adjMatrix, visited, n, m, i, numVisited);
            }
        }

        return ans ? "Yes" : "No";
    }
}
