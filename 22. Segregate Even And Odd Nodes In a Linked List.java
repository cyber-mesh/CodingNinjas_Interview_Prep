public class Solution
{
    public static Node segregateEvenOdd(Node head)
    {
        if(head==null || head.next==null){
            return head;
        }
        Node evenStart=null,evenEnd=null,oddStart=null,oddEnd=null;
        Node temp=head;
        while(temp!=null){
            int curVal=temp.data;
            if(curVal%2==0){
                if(evenStart==null){
                    evenStart=temp;
                    evenEnd=evenStart;
                }
                else{
                    evenEnd.next=temp;
                    evenEnd=evenEnd.next;
                }
            }
            else{
              if(oddStart==null){
                  oddStart=temp;
                  oddEnd=oddStart;
              }
              else{
                  oddEnd.next=temp;
                  oddEnd=oddEnd.next;
              }


            }
            temp=temp.next;
        }
        if(oddStart!=null && evenStart!=null){
            oddEnd.next=null;
            evenEnd.next=oddStart;
            head=evenStart;
        }
        return head;
    }
}
