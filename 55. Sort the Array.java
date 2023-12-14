import java.util.* ;
import java.io.*; 
public class Solution {
	public static int sortArray(int N, int[] A) {
        int[][] O = new int[N + 1][2];
        for (int i = 0; i <= N; i++) {
            O[i][0] = N + 1;
            O[i][1] = N + 1;
        }
        for (int i = 0; i < N; ++i) {
            int currentValue = A[i];
            O[currentValue][0] = Math.min(O[currentValue][0], i);
            O[currentValue][1] = i;
        }
        int ans = 0, tot = 0, last = N + 1, ctr = 0;
        for (int i = N; i > 0; i--) {
            if (O[i][0] != N + 1) {
                ctr++;
                if (O[i][1] < last) {
                    tot++;
                    ans = Math.max(ans, tot);
                    last = O[i][0];
                } else {
                    tot = 1;
                    last = O[i][0];
                }
            }
        }
        return ctr - ans;
	}
}

