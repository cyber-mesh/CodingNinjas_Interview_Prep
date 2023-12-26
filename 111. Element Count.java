import java.util.HashSet;

public class Solution {
    public static int elementCount(int[] A) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : A)
                hs.add(i);
        int ans = 0;
        for (int i : A)
            if (hs.contains(i + 1))
                ans++;
        return ans;
    }
}
