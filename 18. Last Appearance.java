public class Solution {
	public static Node lastAppearance(Node head) {
		HashMap<Integer, Integer> map = new HashMap<>();
       if(head == null || head.next == null) return head;
       Node curr = head;
       Node prev = null;
       while(curr != null)
       {
           map.put(curr.data, map.getOrDefault(curr.data, 0) + 1);
           curr = curr.next;
       }
       Node temp  = head;
       while(temp.next!= null)
       {
           if(temp == head && map.get(temp.data) > 1)
           {
               map.put(temp.data, map.get(temp.data) - 1);
               head = head.next;
               temp.next = null; 
               temp  = head;
               prev = head;
          }
           else
           {
               if(map.get(temp.data) > 1)
               {
                map.put(temp.data, map.get(temp.data) - 1);
                 temp = temp.next;
                 prev.next = temp;
               }
               else{        
                prev = temp; 
                temp = temp.next;
               }
           }           
       }
       return head;
	}
}
