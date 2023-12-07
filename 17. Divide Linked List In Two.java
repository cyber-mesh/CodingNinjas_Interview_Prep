public class Solution {
    public static Pair divideList(Node head) {
        Node head1=new Node(-1);
        Node temp1=head1;
        Node head2=new Node(-1);
        Node temp2=head2;
        int i=1;
        while(head!=null)
        {
            if(i%2!=0)
            {
                Node temp=new Node(head.data);
                temp1.next=temp;
                temp1=temp;
            }
            else
            {
                Node temp=new Node(head.data);
                temp2.next=temp;
                temp2=temp;
            }
            i++;
            head=head.next;
        }
        return new Pair(head1.next,head2.next);
    }
}
