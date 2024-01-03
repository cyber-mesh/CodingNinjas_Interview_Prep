import java.util.* ;
import java.io.*; 
public class Solution {
    public static int strangeNumbers(int n) {
        int count=0;
        for(int i = 1;i<=n;i++){
            int reverse = 0;
            boolean valid = false;
            int k = i;
            while(k!=0)
			{
                int r = k % 10;
                if(r==2 || r==3|| r==4||r==5||r==7)
				{
                    valid = true;
                    break;
                }
                else if(r==6)
                    r=9;

                else if(r==9)
                    r=6;
                reverse = reverse * 10 + r;  
                k = k/10;  
            }
            if(reverse!=i && !valid)
                count++;
        }
        return count;
    }
}
