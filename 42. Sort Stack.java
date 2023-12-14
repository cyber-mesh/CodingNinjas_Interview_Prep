import java.util.* ;
import java.io.*; 
public class Solution {
	public static Stack<Integer> sortStack(Stack<Integer> s) {
		Stack<Integer> tempStack = new Stack<>();
        while (!s.isEmpty()) {
            int temp = s.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                s.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        return tempStack;
	}
}

