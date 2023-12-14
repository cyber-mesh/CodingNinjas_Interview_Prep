import java.util.* ;
import java.io.*; 
public class Solution {
	public static long sumOfSquares(int n) {
		long ans=0;
		for(int i=1;i<=n;i++)
		{
			ans+= i*i;
		}
		return ans;	
	}
}
