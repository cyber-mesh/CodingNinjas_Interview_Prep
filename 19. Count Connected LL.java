import java.util.HashMap;
public class Solution {
    public static int countConnected(Node head, int[] arr, int m) {
        Node temp = head;
        int count, rep;
        count=rep=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        while (temp != null) {
            if (map.containsKey(temp.data) && map.get(temp.data) == 1) {
                rep++;
            } else {
                if (rep > 0) {
                    count++;
                }
                rep = 0;
            }
            temp = temp.next;
        }
        if (rep > 0) {
            count++;
        }
        return count;
    }
}
