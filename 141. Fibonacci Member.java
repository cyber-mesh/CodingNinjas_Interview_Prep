import java.util.*;
public class Solution 
{
	public static boolean checkMember(int n)
	{    
		HashMap<Integer,Integer> hm=new HashMap<>();       	
		boolean flag=false;
			hm.put(0,0);
			hm.put(1,1);        
			int i=2;        
		while(i<=n+1)
		{     
			if(hm.get(i-1)+hm.get(i-2)==n )
			{
				 flag=true;            
				break;           
			}            
			else
			{           
				hm.put(i,hm.get(i-1)+hm.get(i-2));               
				i++;          
			}      
		}
		return n==0||n==1?true:flag;
	}  

}  
