import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
public class Solution {
    public static ArrayList<ArrayList< Integer >> uniquePermutations(ArrayList<Integer> arr, int n) 
    {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<arr.size();i++) {
            map.put(arr.get(i),map.getOrDefault(arr.get(i), 0)+1);
        }        
       LinkedList<Integer> comb = new LinkedList<>();          
       backtrack(comb,arr.size(),map,result);        
       return result;
    }
    static void backtrack(LinkedList<Integer> comb,int n,Map<Integer,Integer> map,ArrayList<ArrayList<Integer>> result) {
        if (comb.size()==n) 
        {
            result.add(new ArrayList<>(comb));
            return;
        }
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) 
        {
            int num = entry.getKey();
            int value = entry.getValue();
            if (value==0)
                continue;
            comb.addLast(num);
            map.put(num,value-1);
            backtrack(comb, n, map, result);
            comb.removeLast();
            map.put(num,value);
        }
    }
}

