import java.util.ArrayList;

public class Solution {

    public static ArrayList<Integer> justiceLeague(ArrayList<ArrayList<Integer>> intervals, ArrayList<Integer> codeNames) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int n=codeNames.size();
        for(int i=0; i<n; i++)
        {
            int code=codeNames.get(i);
            int f=0;
            for(int j=0; j<n; j++)
            {
                ArrayList<Integer> limits = new ArrayList<Integer>();
                limits= intervals.get(j);
                int left=limits.get(0);
                int right=limits.get(1);
                if(code == left || code == right || (code>left && code<right))
                {
                    if(f==0)
                    {
                        res.add(right-left+1);
                        f++;
                    }
                    else{
                        if(res.get(i)> right-left+1 )
                        {
                            res.remove(i);
                            res.add(right - left +1);
                        }
                    }
                }
            }
            if(f==0)
                res.add(-1);    
        }
        return res;
    }
}
