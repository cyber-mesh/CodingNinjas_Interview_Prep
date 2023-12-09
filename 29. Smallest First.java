import java.util.*;
import java.util.ArrayList;
public class Solution {
    public static int count(int n, int []arr) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        int c=0;
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(arr[j]>=arr[i])
                    cnt++;
                else break;
            }
        }
        return cnt;
    }
}
