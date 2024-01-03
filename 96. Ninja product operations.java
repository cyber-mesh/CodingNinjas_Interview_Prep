import java.util.Arrays;
public class Solution {
	
	public static int minProduct(int[] arr, int n, int k) {
		if(n==0)
			return 0;
		Arrays.sort(arr);
		int res=1;
		for(int i=0; i<k; i++)
			res=res*arr[i];
		return res%(1000000000+7);
	}
}
