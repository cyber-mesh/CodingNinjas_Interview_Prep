import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javafx.util.Pair; 
public class Solution {
    static class PairComparator implements Comparator<Integer> {
        HashMap<Integer, int[]> mp = new HashMap<>();
        public PairComparator(HashMap<Integer, int[]> map) {
            mp = map;
        }
        public int compare(Integer a, Integer b) {
            int[] pairA = mp.get(a);
            int[] pairB = mp.get(b);

            if (pairA[0] == pairB[0]) {
                return pairA[1] - pairB[1];
            }
            return pairB[0] - pairA[0];
        }
    }
    public static int[] sortByFrequency(int[] nums) {
        HashMap<Integer, int[]> mp = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (mp.containsKey(nums[i])) {
                mp.get(nums[i])[0]++;
            } else {
                int[] pair = new int[] { 1, i };
                mp.put(nums[i], pair);
            }
        }
        Integer[] numArr = new Integer[n];
        for (int i = 0; i < n; i++) {
            numArr[i] = nums[i];
        }
        Arrays.sort(numArr, new PairComparator(mp));
        for (int i = 0; i < n; i++) {
            nums[i] = numArr[i];
        }
        return nums;
    }
}
