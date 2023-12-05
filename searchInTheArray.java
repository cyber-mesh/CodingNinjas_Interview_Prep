import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> searchInTheArray(ArrayList<Integer> arr, ArrayList<Integer> queries, int n, int q) {
        ArrayList<Integer> result= new ArrayList<Integer>();
        Collections.sort(arr);
        for(int i=0; i<queries.size(); i++)
        {
            int sum=0;
            for(int j=0; j<arr.size(); j++)
            {
                if(arr.get(j)<= queries.get(i))
                    sum+=arr.get(j);
            }
            result.add(sum);
        }
        return result;
    }
}
