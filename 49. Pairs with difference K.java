import java.util.Arrays;
public class Solution {

	public static int getPairsWithDifferenceK(int arr[], int k) {
		int c=0;
		Arrays.sort(arr);
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(Math.abs(arr[i]-arr[j]) == k)
					c++;
				if(Math.abs(arr[i]-arr[j]) > k)
					break;
			}
		}
		return c;
	}
}
