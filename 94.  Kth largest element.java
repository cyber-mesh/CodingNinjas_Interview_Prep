import java.util.Arrays;
public class Solution {

	public static int kthLargest(int n, int[] input, int k) 
	{	
		Arrays.sort(input);
		int len=input.length;
		return input[len-k];
	}
}
