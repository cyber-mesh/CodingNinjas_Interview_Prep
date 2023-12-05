import java.util.* ;
import java.io.*;
import java.util.Arrays; 
public class Solution {

    public static long[] problemSelection(int[] A, int K) {
        int n=A.length;
        Arrays.sort(A);
        int max, min, c;
        max=min=c=0;
        for(int i=0; i<n-c; i++)
        {
            min=A[i]+ min;
            max=A[n-1-i]+ max;
            c+=K;
        }
        long result[]={min, max};
        return result;
    }
}
