import java.util.ArrayList;
import java.util.Collections;
public class Solution {
	public static ArrayList<String> generatePermutations(String str) {
		ArrayList<String>list=new ArrayList<>();
        solve(str,0,list);
        Collections.sort(list);
        return list;
	}
	public static void solve(String str,int index,ArrayList<String>list){
        if(index==str.length()){
            list.add(str);
            return;
        }
        for(int i=index;i<str.length();i++){
		   	str=swap(str,index,i);
        	solve(str, index+1, list);
            str=swap(str,index,i);
        }
    }
    public static String swap(String str,int i,int j){
        char arr[]=str.toCharArray();
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return new String(arr);
    }
}
