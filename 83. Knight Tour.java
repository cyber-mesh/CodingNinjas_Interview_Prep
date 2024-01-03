import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static boolean aux(int n, int m, ArrayList<ArrayList<Integer>> ans, ArrayList<ArrayList<Integer>> vis, int row, int col, int m_idx) {
        ans.get(row).set(col, m_idx);

        if (m_idx >= (n * m) - 1) {
            return true;
        }

        vis.get(row).set(col, 1);

        int[][] moves = { { 2, 1 }, { 2, -1 }, { -2, 1 }, { -2, -1 }, { 1, 2 }, { 1, -2 }, { -1, 2 }, { -1, -2 } };

        for (int[] move : moves) {
            int newRow = row + move[0];
            int newCol = col + move[1];

            if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && vis.get(newRow).get(newCol) == 0) {
                if (aux(n, m, ans, vis, newRow, newCol, m_idx + 1)) {
                    return true;
                }
            }
        }

        ans.get(row).set(col, -1);
        vis.get(row).set(col, 0);
        return false;
    }

    public static ArrayList<ArrayList<Integer>> knightTour(int n, int m) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<ArrayList<Integer>> vis = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            ArrayList<Integer> rowVis = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                row.add(-1);
                rowVis.add(0);
            }
            ans.add(row);
            vis.add(rowVis);
        }

        int m_idx = 0;
        aux(n, m, ans, vis, 0, 0, m_idx);
        return ans;
    }

    public static void printBoard(ArrayList<ArrayList<Integer>> board) {
        for (ArrayList<Integer> row : board) {
            for (int cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
}
