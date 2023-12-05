import java.util.* ;
import java.io.*; 
class Solution {
    public static int calculateMaximisedSum(int[] arr1, int[] arr2, int n) {
        int[][] dp = new int[n][2];
        dp[0][0] = Math.abs(arr1[0] - arr2[0]);
        dp[0][1] = Math.abs(arr1[0] - arr2[0]);

        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.abs(arr1[i] - arr2[i]) + Math.max(
                dp[i - 1][0] + Math.abs(arr1[i] - arr2[i - 1]),
                dp[i - 1][1] + Math.abs(arr1[i] - arr1[i - 1])
            );
            dp[i][1] = Math.abs(arr1[i] - arr2[i]) + Math.max(
                dp[i - 1][0] + Math.abs(arr2[i] - arr2[i - 1]),
                dp[i - 1][1] + Math.abs(arr2[i] - arr1[i - 1])
            );
        }
        return Math.max(dp[n - 1][0], dp[n - 1][1]);
    }
}
