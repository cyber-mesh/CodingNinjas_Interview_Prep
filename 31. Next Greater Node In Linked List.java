import java.util.* ;
import java.io.*; 
import java.util.Stack;
/************************************************************

 Following is the Node class structure

 class Node
 {
     int data;
     Node next;

     Node(int x)
     {
       this.data = x;
       this.next = null;
     }
 };

 ************************************************************/
public class Solution
{
    public static Node reverseList(Node head)
    {
        Node prev=null;
	    Node curr=head;
	    Node forward=null;

	    while(curr!=null){
            forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        return prev;
    }
    public static int[] findNextGreaterNodeList(Node head)
    {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        // Traverse the linked list and store node values in an ArrayList
        while (head != null) {
            list.add(head.data);
            head = head.next;
        }

        int[] ans = new int[list.size()];

        // Check for the next greater node using the stack
        for (int i = list.size() - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= list.get(i)) {
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? 0 : stack.peek();
            stack.push(list.get(i));
        }

        return ans;
    }
}
