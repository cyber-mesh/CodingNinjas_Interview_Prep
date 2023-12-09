import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
public class MaxStack {
	Stack<Integer> stack;
	ArrayList<Integer> arr;
	public MaxStack() {
		stack= new Stack<Integer>();
		arr = new ArrayList<Integer>();
	}

	public void specialPush(int value) {
		stack.push(value);
		arr.add(value);
		Collections.sort(arr);
	}

	// Return the popped value.
	public int specialPop() {
		if(stack.isEmpty())
			return -1;
		int n=stack.pop();
		arr.remove(Integer.valueOf(n));
		Collections.sort(arr);
		return n;
	}

	// Return the value at the top of stack.
	public int specialTop() {
		if(stack.isEmpty())
			return -1;
		return stack.peek();
	}

	// Return the maximum value in stack.
	public int specialMax() {
		if(stack.isEmpty())
			return -1;
		return arr.get(arr.size()-1);
	}
}
