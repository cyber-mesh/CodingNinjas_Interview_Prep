import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static int maxPerimeterTriangle(ArrayList<Integer> arr, int n) {
        int maxPerimeter=0;
        Collections.sort(arr);
        for (int i = n - 1; i >= 2; i--) 
        {
            if (arr.get(i-2) + arr.get(i-1) > arr.get(i)) 
                return arr.get(i-2) + arr.get(i-1) + arr.get(i);
        }
        return maxPerimeter;
    }
}
