public class Solution {

    public static Node insertAtFirst(Node head,int val){
        Node nodeToInsert=new Node(val);
        nodeToInsert.next=head;
        head.prev=nodeToInsert;
        head=nodeToInsert;
        return head;
    }
    public static Node insertAtEnd(Node head,int val){
        Node nodeToInsert=new Node(val);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        nodeToInsert.next=null;
        nodeToInsert.prev=temp;
        temp.next=nodeToInsert;
        return head;
    }
    public static Node insertAtPos(Node head,int pos,int val){
        Node nodeToInsert=new Node(val);
        Node temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        nodeToInsert.next=temp.next;
        nodeToInsert.prev=temp;
        temp.next.prev=nodeToInsert;
        temp.next=nodeToInsert;
        return head;
    }
    static Node insert(int k, int val, Node head) {
        int cnt=0;
        Node temp=head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        if(k==0){
            return insertAtFirst(head,val);
        }
        else if(k==cnt){
            return insertAtEnd(head,val);
        }else{
            return insertAtPos(head,k,val);
        }
    }
}
