import java.util.* ;
import java.io.*; 
public class Solution {
	public static int maxStackSum(int stack1[], int stack2[], int stack3[]) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int sum1 = 0, sum2 = 0, sum3 = 0;
		for (int i : stack1) {
			sum1 += i;
		}
		for (int i : stack2) {
			sum2 += i;
		}
		for (int i : stack3) {
			sum3 += i;
		}
		for (int i = 0; i < stack1.length; i++) {
			int temp2 = stack1[i];
			stack1[i] = sum1;
			sum1 -= temp2;
			if (map.containsKey(stack1[i])) {
				map.put(stack1[i], map.get(stack1[i]) + 1);
			} else {
				map.put(stack1[i], 1);
			}
		}
		for (int i = 0; i < stack2.length; i++) {
			int temp2 = stack2[i];
			stack2[i] = sum2;
			sum2 -= temp2;
			if (map.containsKey(stack2[i])) {
				map.put(stack2[i], map.get(stack2[i]) + 1);
			} else {
				map.put(stack2[i], 1);
			}
		}
		for (int i = 0; i < stack3.length; i++) {
			int temp2 = stack3[i];
			stack3[i] = sum3;
			sum3 -= temp2;
			if (map.containsKey(stack3[i])) {
				if (map.get(stack3[i]) + 1 == 3)
					return stack3[i];
				map.put(stack3[i], map.get(stack3[i]) + 1);
			} else {
				map.put(stack3[i], 1);
			}
		}
		return 0;
	}
}

