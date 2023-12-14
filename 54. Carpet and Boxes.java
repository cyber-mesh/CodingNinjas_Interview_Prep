import java.util.* ;
import java.io.*; 
import java.util.Arrays;
public class Solution {
	public static int getMinimumLength(int[] position, int k) {
		Arrays.sort(position);
		int len=Integer.MAX_VALUE;
		if(k==position.length)
			return position[k-1]-position[0]+1;
		for(int i=0; i<=position.length-k; i++)
		{
			int sum=position[i+k-1]-position[i]+1;
			if(len>sum)
				len=sum;
		}
		return len;
	}
}
