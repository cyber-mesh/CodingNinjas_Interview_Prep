import java.util.* ;
import java.io.*; 
public class Solution {
    public static List<Integer> searchInSortedArray(int[] arr, int n, int[] queries, int q) {
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0; i<q; i++)
        {
            int f=0;
            for(int j=0; j<n; j++)
            {
                if(arr[j] == queries[i])
                {
                    f++;
                    list.add(1);
                    break;
                }
                if(arr[j] > queries[i])
                    break;
            }
            if(f==0)
                list.add(0);
        }
        return list;
    }
}
