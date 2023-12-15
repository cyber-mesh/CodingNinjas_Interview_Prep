import java.util.Arrays;
public class Solution {
    public static int[] countS(int n, int m, int []a, int []b) {
        int arr[] = new int[n];
        Arrays.sort(b);
        for(int i=0; i<n; i++)
        {
            int c=0;
            for(int j=0; j<m; j++)
            {
                if(b[j]<= a[i])
                    c++;
                else
                    break;
            }
            arr[i]=c;
        }
        return arr;
    }
}
