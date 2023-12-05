import java.util.ArrayList;
public class Solution {
    static boolean good(int mid, int m, int n, int[] a) {
        int prev = 0;

        for (int i = 0; i < n; i++) {
            int lf = a[i];
            int rf = a[i] + mid;

            if ((prev >= lf && prev <= rf) || ((prev + m) >= lf && (prev + m) <= rf)) {
                continue;
            }

            if (lf < prev) {
                return true;
            }

            prev = lf;
        }

        return false;
    }

    static int findMinimum(int n, int m, int[] a) {
        int l = -1, r = m;

        while (l < r - 1) {
            int mid = (l + r) / 2;

            if (good(mid, m, n, a)) {
                l = mid;
            } else {
                r = mid;
            }
        }

        return r;
    }
}
