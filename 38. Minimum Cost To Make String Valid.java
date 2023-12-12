import java.util.* ;
import java.io.*; 
import java.util.Stack;
public class Solution {
    public static int findMinimumCost(String s) {
      if(s.length()%2 == 1)
        return -1;
      Stack<Character> res = new Stack<Character>();
      for(int i=0; i<s.length(); i++)
      {
        if(s.charAt(i)== '{')
          res.push(s.charAt(i));
        else
        {
          if(res.isEmpty() || res.peek()=='}')
            res.push(s.charAt(i));
          else  
            res.pop();
        }
      }
      int a=0,b=0;
      while(!res.isEmpty()){
        if(res.peek()=='{'){
          a++;
          res.pop();
          }
        else{
          b++;
          res.pop();
        }
      }
      return (a+1)/2 + (b+1)/2;
    }
}
