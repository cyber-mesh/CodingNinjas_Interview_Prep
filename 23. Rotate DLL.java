public class Solution 
{
	public static DLLNode rotateDLL(DLLNode head, int k)
    {
		 DLLNode curr=head;
         int cnt=1;
         while(curr!=null && cnt<k){
             cnt++;
             curr=curr.next;
         }
         DLLNode kthnode=curr;
         while(curr.next!=null){
             curr=curr.next;
         }
         curr.next=head;
         head.prev=curr;
         head=kthnode.next;
         kthnode.next=null;
         return head;
	}
}
