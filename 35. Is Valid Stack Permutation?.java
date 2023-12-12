import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    public static boolean validStackPermutation(ArrayList<Integer> first, ArrayList<Integer> other){
        Stack<Integer> st = new Stack<>();
        int p = 0;

        for (int i = 0; i < first.size(); i++) {
            st.push(first.get(i));

            while (!st.empty() && p < other.size() && other.get(p) == st.peek()) {
                p++;
                st.pop();
            }
        }

        return st.empty();
    }
}
