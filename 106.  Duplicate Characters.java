import java.util.* ;
import java.io.*; 
import java.util.*;
/****
 * Following is the java Pair class
 * class Pair{
    char alphabet;
    int count;
    Pair(char ch, int x){
        this.alphabet = ch;
        this.count = x;
    }
}
 */


public class Solution {

    public static ArrayList<Pair> duplicate_char(String s, int n) {
        ArrayList<Pair> arr= new ArrayList<Pair>();
        int p=0;
        for(int i=65; i<=90; i++)
        {
            int c=0;
            for(int j=0; j<n; j++)
            {
                if(s.charAt(j)==i || s.charAt(j)== i+32)
                {
                    c++;
                    p=j;
                }
            }
            if(c>1)
            {
                char ch= s.charAt(p);
                int x=c;
                arr.add(new Pair(ch, x));
            }
        }
        return arr;
    }
}
