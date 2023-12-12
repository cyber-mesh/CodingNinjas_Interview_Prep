import java.util.* ;
import java.io.*; 
import java.util.Stack;
public class Solution {
    static Stack < Integer > reverseTheGroups(Stack < Integer > s, int n, int k) {
        Stack<Integer> r = new Stack<>();
        Stack<Integer> ans = new Stack<>();
        
        while (s.size() >= k) {
            for (int i = 1; i <= k; i++) {
                r.push(s.pop());
            }
            for (int j = 1; j <= k; j++) {
                ans.push(r.pop());
            }
        }
        
        while (!ans.empty()) {
            s.push(ans.pop());
        }
        
        return s;
    }
}
