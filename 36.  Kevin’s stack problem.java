import java.util.* ;
import java.io.*; 
import java.util.Stack;
public class Solution 
{
    public static String kevinStackProblem(String s)
    {
        String wrd="";
        for(int i=0; i<s.length(); i++)
            wrd= s.charAt(i)+wrd;
        return wrd;
    }
}
