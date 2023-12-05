 import java.util.ArrayList;
public class Solution {

	public static ArrayList<Integer> characterQuery(int n, int q, char[] arr, char[] type, char[] letter, int[] value) 
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=0; i<q; i++)
		{
			int c=0;
			if(type[i]=='L')
			{
				for(int j=0; j<n; j++)
				{
					if(arr[j]==letter[i])
						c++;
					if(c>value[i])
					{
						result.add(j);
						break;
					}
				}
				if(c==value[i])
					result.add(n);
			}
			else{
				for(int j=0; j<n; j++)
				{
					if(arr[j]== letter[i])
						c++;
					if(c==value[i])
					{
						result.add(j+1);
						break;
					}
				}
			}
		}
		return result;
	}
}
