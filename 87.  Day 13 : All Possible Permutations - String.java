import java.util.* ;
import java.io.*; 
public class Solution {
    public static void rec(List<String> al, boolean vis[],String s,String d){
      if(d.length()==s.length()){
        al.add(d);
        return;
      }
      for(int i=0;i<s.length();i++){
        if(!vis[i]){
          vis[i]=true;
          rec(al,vis,s,d+s.charAt(i));
          vis[i]=false;
        }
      }
    }
    public static List<String> findPermutations(String s) {
        List<String> al=new ArrayList<>();
        boolean v[]=new boolean[s.length()];
        rec(al,v,s,"");
        return al;
    }
}
