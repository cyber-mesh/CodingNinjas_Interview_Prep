import java.util.Arrays;
public class Solution {
    public static int kthSmallest(int n,int k, int[]arr) {
        Arrays.sort(arr);
        return arr[k-1];
    }
}
