import java.util.Arrays;
public class Solution {

	public static long maxProfit(int m, int n, int[] input) {
		int len= m;
		int sum=0;
		Arrays.sort(input);
		for(int i=n; i>0; i--)
		{
			if(input[len-1]<input[len-2])
			{
				len--;
				sum+=arr[len-1];
			}
		}	
	}
	
}
