import java.util.* ;
import java.io.*; 
public class Solution {
	public static int[] countEvenOdd(int[] arr, int n) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i : arr)
			hm.put(i, hm.getOrDefault(i, 0) + 1);
		int odd = 0, even = 0;
		for (int f : hm.values())
			if (f % 2 == 0)
				even++;
			else
				odd++;
		return new int[] { odd, even };
	}
}
