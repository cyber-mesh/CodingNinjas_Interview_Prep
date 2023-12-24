import java.util.Collections;
import java.util.PriorityQueue;
public class Solution {
    public static int weightOfLastStone(int arr[]) {
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : arr) {
            que.add(num);
        }
        while (que.size() > 1) {
            int a = que.poll();
            int b = que.poll();
            if (a == b) {
                continue;
            } else {
                que.add(a > b ? a - b : b - a);
            }
        }
        return que.isEmpty() ? 0 : que.poll();
    }   
}
