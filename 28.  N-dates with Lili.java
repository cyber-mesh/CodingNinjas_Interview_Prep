import java.util.* ;
import java.io.*; 

public class Solution {
  public static int maxTotalCoins(int arr[], int n, int k) {
    int max, num;
    max=0;
    for(int i=0; i<n; i++)
    {
      num=0;
      for(int j=i; j<= Math.min(n, i+k-1); j++)
      {
          if(arr[j]>num)
            num=arr[j];
      }
      max+=num;
    }
    return max;
  }
}
