import java.util.* ;
import java.io.*; 
public class Solution {

    public static int sumOfSmallestAndSecondSmallest(int n, int[] arr) {

        int sum=arr[0]+arr[1];
        int curr = sum;
        for(int i=1; i<n-1; i++)
        {
            curr= curr -arr[i-1]+arr[i+1];
            sum = Math.max(curr, sum);
        }
        return sum;
    }
}
