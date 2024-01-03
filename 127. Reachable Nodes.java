import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    private static ArrayList<ArrayList<Integer>> graph;
    private static boolean[] visited;

    // Utility function that returns the number of nodes in a component
    private static  int dfs(int s) {
        visited[s] = true;

        int count = 0;

        // Travel through its adjacents
        for (int adj : graph.get(s)) {
            if (visited[adj] == false) {
                // Update the count of nodes in this component
                count += dfs(adj);
            }
        }

        // Total count of nodes is equal to count of nodes to its adjacent plus this current node 's'
        return count + 1;
    }

    public static ArrayList<Integer> countNodes(int n, int m, ArrayList<ArrayList<Integer>> edges) {

        graph = new ArrayList<ArrayList<Integer>>(n);
        visited = new boolean[n];

        Arrays.fill(visited, false);

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        // Run a loop from 0 to 'm'
        for (int i = 0; i < m ; i++) {
            int u = edges.get(i).get(0);
            int v = edges.get(i).get(1);

            // Add edge u - v in graph
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // Take an array 'ans' to store the answer.
        ArrayList<Integer> ans = new ArrayList<Integer>();

        // Run a loop from 0 to 'n'.
        for (int i = 0; i < n; i++) {
            // Perform dfs call.
            int count = dfs(i);

            // Mark visited of node 'i' to false for next dfs.
            for (int j = 0; j < n; j++) {
                visited[j] = false;
            }

            ans.add(count);
        }

        // Return 'ans'
        return ans;

    }
}
