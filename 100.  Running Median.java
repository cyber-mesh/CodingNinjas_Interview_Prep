import java.util.PriorityQueue;
import java.util.Comparator;
public class Solution {
    public static void findMedian(int arr[]) {
        int n = arr.length;
        if (n == 0)
            return;
        PriorityQueue<Integer> s = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> g = new PriorityQueue<>();
        s.add(arr[0]);
        System.out.print(arr[0] + " ");
        for (int i = 1; i < n; i++) 
		{
            int x = arr[i];
            if (s.size() > g.size()) 
			{
                if (x < s.peek()) 
				{
                    g.add(s.poll());
                    s.add(x);
                } 
				else
                    g.add(x);
                System.out.print(((s.peek() + g.peek()) / 2)+" ");
            } 
			else 
			{
                if (x < s.peek())
                    s.add(x);
                else 
				{
                    g.add(x);
                    s.add(g.poll());
                }
                System.out.print(s.peek()+" ");
            }
        }
    }
}
