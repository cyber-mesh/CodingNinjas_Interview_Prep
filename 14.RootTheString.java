import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static int root(String s)
	{
        int i, j;
        String wrd, res;
        wrd=res="";
	    for(i=0; i<s.length(); i++)
        {
            wrd=wrd+s.charAt(i);
            res="";
            for(j=1; ;j++)
            {
                res=res+wrd;
                if(res.equals(s))
                {
                    return j;
                }
                else if(res.length()>s.length())
                    break;
            }
        }
        return 1;
    }
    public static void main(String args[])
    {
        System.out.println(root("aaaa"));
    }

}
