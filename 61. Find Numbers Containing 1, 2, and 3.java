import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public static ArrayList<Integer> containsNumber(int n, ArrayList<Integer> arr) {
		int c1, c2, c3;
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for(int i=0; i<n; i++)
		{
			c1=c2=c3=0;
			for(int j=arr.get(i); j>0; j=j/10)
			{
				int d=j%10;
				if(d==1)
					c1++;
				if(d==2)
					c2++;
				if(d==3)
					c3++;
			}
			if(c1>0 && c2>0 && c3>0)
				ans.add(arr.get(i));
		}
		Collections.sort(ans);
		return ans;
	}
}
