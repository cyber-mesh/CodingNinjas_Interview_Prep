import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
public class Solution 
{
	public static boolean checkDouble(String s)
	{
		int mid= s.length()/2;
		for(int i=0; i<mid; i++)
		{
			if(s.charAt(i) != s.charAt(mid+i))
				return false;
		}
		return true;
	}
	public static int findDoubleStrings(String s) 
	{
		s=s+" ";
		HashSet<String> arr = new HashSet<String>();
		for(int i=0; i<s.length()-1; i++)
		{
			for(int j=2; j<s.length()-i; j+=2)
			{
				String sub= s.substring(i, i+j);
				if(checkDouble(sub))
						arr.add(sub);
			}
		}
		return arr.size();
	}	
}

