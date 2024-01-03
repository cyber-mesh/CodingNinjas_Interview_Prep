import java.util.* ;

import java.io.*; 

public class Solution {
    public static int maxTownOrder(int n, int m, int[][] g)  {
       HashSet<Integer>[] map = new HashSet[n];
        for(int i=0;i<m;i++)
        {
            int x=g[i][0];
            int y=g[i][1];
            if(map[x]==null)
                map[x]=new HashSet<>();
            if(map[y]==null)
                map[y]=new HashSet<>();
            map[x].add(y);
            map[y].add(x);
        }
        int max=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(i==j)
                    continue;
                if(map[i]!=null&&map[j]!=null)
                {
                    int x=map[i].size();
                    int y=map[j].size();
                    int sum=x+y;
                    if(map[i].contains(j))
                        sum--;
                    max=Math.max(sum,max);
                }
            }
        }
        return max;
    }
}
