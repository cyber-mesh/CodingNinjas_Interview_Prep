import java.util.* ;
import java.io.*; 
public class Solution {
    static int mod = 1_000_000_007;
    static long solve(int n) {
        long prev = 0;
        long curr = 0;
        long secondPrev = 0;
        secondPrev = 1;
        prev = 2;
        if (n == 1)
            return 1;
        for (int i = 3; i <= n; i++) {
            curr = ((prev % mod) + ((i - 1) * secondPrev) % mod) % mod;
            secondPrev = prev;
            prev = curr;
        }
        return prev;
    }
    static int numberOfWays(int n) {
        return (int) solve(n);
    }
}
