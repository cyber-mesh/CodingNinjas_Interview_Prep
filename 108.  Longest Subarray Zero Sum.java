import java.util.HashMap;
public class Solution 
{        
	public static int lengthOfLongestSubarray(int[] arr) 
	{
		int maxLength = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); 
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum))
                maxLength = Math.max(maxLength, i - map.get(sum));
            else 
                map.put(sum, i);
        }
        return maxLength;
	}
}
