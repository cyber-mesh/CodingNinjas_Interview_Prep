public class Solution {
    public static int searchInsert(int [] arr, int m){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>=m)
            {
                ans=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return ans;
    }
}
