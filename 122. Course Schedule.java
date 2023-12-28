import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static String canFinish(ArrayList<ArrayList<Integer>> arr, int n, int m) {
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<n;i++) l.add(new ArrayList<>());
        for(int i=0;i<m;i++){
          int a=arr.get(i).get(0), b=arr.get(i).get(1);
          l.get(a-1).add(b-1);
        }
        int indeg[]=new int[n];
        for(int i=0;i<n;i++) for(int j:l.get(i)) indeg[j]++;
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++) if(indeg[i]==0) q.add(i);
        List<Integer> tp=new ArrayList<>();
        while(!q.isEmpty()){
          int curr=q.poll();
          tp.add(curr);
          for(int i:l.get(curr)){
             indeg[i]--;
             if(indeg[i]==0) q.add(i);
          }
        }
        return tp.size()==n?"Yes":"No";
	}
}
