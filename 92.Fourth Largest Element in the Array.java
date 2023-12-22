public class Solution 
{    
    public static int getFourthLargest(int[] arr) 
    {
        int n = arr.length;
        if(n<4)
            return Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j-1]>arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[n-4];
    }

}
