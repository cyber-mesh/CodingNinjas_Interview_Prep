public class Solution {
	public static Node getListAfterReverseOperation(Node head, int n, int b[]) {
		int size = getSize(head);
        int s = 0, e = -1;
        for(int i=0; i<n; i++){
            e += b[i];
            if(e >= size){
                if(s < size-1){
                    head = reverse(s,size-1, head);
                }
                break;
            } 
            head = reverse(s, e, head);
            s = e+1;
        }
        return head;
	}
	public static Node reverse(int s, int e, Node head){
        Node left = getNode(head, s-1);
        Node right = getNode(head, e+1);
        Node curr = getNode(head, s);
        Node prev = right;
        Node next;
        while(curr != right){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        if(s==0) head = prev;
        else left.next = prev;
        return head;
    }
    public static Node getNode(Node head, int index){
        if(index < 0) return null;
        Node node = head;
        for(int i=0; i<index; i++){
            node = node.next;
        }
        return node;
    }
    public static int getSize(Node head){
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }
}
