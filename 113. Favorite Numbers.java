import java.util.*;
public class Solution {
	int[] freq = new int[100001]; // Assuming values in arr are non-negative integers less than 100001
        int favCount = new HashSet<>(Arrays.asList(favArr)).size();
        int left = 0, subarrays = 0, currCount = 0;

        for (int right = 0; right < arr.length; right++) {
            if (isFavorite(favArr, arr[right])) {
                freq[arr[right]]++;
                if (freq[arr[right]] == 1) {
                    currCount++;
                }
            }

            while (currCount == favCount) {
                if (isFavorite(favArr, arr[left])) {
                    freq[arr[left]]--;
                    if (freq[arr[left]] == 0) {
                        currCount--;
                    }
                }

                subarrays += arr.length - right; // Calculate subarrays when all favorites are present
                left++;
            }
        }
        return subarrays;
    }

    public static boolean isFavorite(int[] favArr, int num) {
        for (int fav : favArr) {
            if (fav == num) {
                return true;
            }
        }
        return false;
    }
}
