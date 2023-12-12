import java.util.Stack;
public class Solution {
	public static int countPairs(int n, int[] arr) {
		int c=0;
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < n; ++i) {
			while (!st.empty() && st.peek() < arr[i]) {
				st.pop();
				c++;
			}
			if (!st.empty()) {
				c++;
				if (st.peek() != arr[i]) {
					st.push(arr[i]);
				}
			}else{
				st.push(arr[i]);
			}
		}

		return c;
	}

}
