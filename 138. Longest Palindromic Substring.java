public class Solution {
    public static String longestPalindromicSubstring(String s) {
        int n = s.length();
        if (n < 2 || s.equals(new StringBuilder(s).reverse().toString())) {
            return s;
        }
        int maxLen = 1;
        int start = 0;
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        for (int length = 2; length <= n; length++) {
            for (int i = 0; i < n - length + 1; i++) {
                int j = i + length - 1;
                if (s.charAt(i) == s.charAt(j) && (length == 2 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    if (length > maxLen) {
                        maxLen = length;
                        start = i;
                    }
                }
            }
        }
        return s.substring(start, start + maxLen);
    }
}
