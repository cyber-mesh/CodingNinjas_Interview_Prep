import java.util.*;
public class Solution {
    static String findStableNumber(int k, String s) {
        StringBuilder res=new StringBuilder();
        for(int i=0; i<s.length(); i++)
        {
                res.append(s.charAt(i%k));
        }
        if(s.compareTo(res.toString())<=0)
            return res.toString();
        int ind=k-1;

        while(ind>=0 && res.charAt(ind)=='9')
        {
            res.setCharAt(ind,'0');
            ind--;
        }
        if (ind >= 0) {
            char c = res.charAt(ind);
            res.setCharAt(ind, ++c);
        }

        for (int i = 0; i < s.length(); i++) {
            res.setCharAt(i, res.charAt(i % k));
        }
        return res.toString();
    }
}
