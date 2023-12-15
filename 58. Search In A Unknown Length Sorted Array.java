/*
You should not implement this.
class UnknownArray {
public:
    int get(int ind) {
    }
};
*/

public class Solution {
    public static int searchInASortedArray(UnknownArray reader, int X) {
        int low=0;
        int high = 1073741824-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            int value= reader.get(mid);
            if(value == X)
                return mid;
            else if(value>X)
                high=mid-1;
            else
                low= low+1;
        }
        return -1;
    }
}



