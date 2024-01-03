import java.util.* ;
import java.io.*; 
public class Solution {
    static int atmost(int b, int[] arr, int n) {
        Map<Integer, Integer> mp = new HashMap<>();
        int i = 0;
        int j = 0;
        int count = 0;

        while (i < n) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
            while (mp.size() > b) {
                mp.put(arr[j], mp.get(arr[j]) - 1);
                if (mp.get(arr[j]) == 0) {
                    mp.remove(arr[j]);
                }
                j++;
            }
            count += (i - j + 1);
            i++;
        }
        return count;
    }
    public static int goodSubarrays(int arr[], int n,int b) {
        return atmost(b, arr, n) - atmost(b - 1, arr, n);
    }
}
