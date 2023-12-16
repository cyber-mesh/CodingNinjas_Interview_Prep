public class Solution {
    public static int maxElement(int[] a){
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++){
            maxi = Math.max(maxi, a[i]);
        }
        return maxi;
    }
    public static int summition(int[] a){
        int sum = 0;
        int n = a.length;
        for(int i=0; i<n; i++){
            sum += a[i];
        }
        return sum;
    }
    public static int subArrysPossible(int []a, int limit){
        int possible = 1;
        int sum = a[0];
        for(int i=1; i<a.length; i++){
            if(sum + a[i] <= limit){
                sum += a[i];
            }
            else{
                possible++;
                sum = a[i];
            }
        }
        return possible;
    }
    public static int largestSubarraySumMinimized(int []a, int k) {
        int n = a.length;
        int low = maxElement(a);
        int high = summition(a);
        while(low<= high){
            int mid = (low+high)/2;
            int possibleSubArrays = subArrysPossible(a, mid);
            if(possibleSubArrays <= k){
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return low;
    }
}
