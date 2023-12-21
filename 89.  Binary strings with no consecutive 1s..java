import java.util.List;
import java.util.ArrayList;
public class Solution {
    public static void rec(List<String> l,String s,int n){
      if(s.length()>n) 
        return;
      if(s.length()==n) 
        l.add(s);
      rec(l,s+'0',n);
      if(s.length()==0 || s.charAt(s.length()-1)!='1') 
        rec(l,s+'1',n);
    }
    public static List<String> generateString(int N) {
        List<String> ans=new ArrayList<>();
        rec(ans,"",N);
        return ans;
    }
}
