import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int countSubstrings(String s) 
	{
		int c=0;
		String wrd="";
		s=s+' ';
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
				wrd=wrd+s.charAt(i);
			else
			{
				for(int j=1; j<=wrd.length(); j++)
					c=c+j;
				wrd="";
			}
		}
		return c;
	}
}
