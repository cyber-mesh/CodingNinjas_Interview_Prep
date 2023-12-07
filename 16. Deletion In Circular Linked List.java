public class Solution {

    public static Node<Integer> deleteNode(Node<Integer> head, int key) {
        if (head == null)
            return head;

        if (head.next == head) {
            if (head.data == key)
                return null;
            return head;
        }

        Node<Integer> temp = head.next;
        Node<Integer> prev = head;

        while (temp != head) {
            if (temp.data == key) {
                temp = temp.next;
                prev.next = temp;
            } else {
                prev = temp;
                temp = temp.next;
            }
        }

        if (head.data == key) {
            prev.next = head.next;
            head = prev.next;
        }

        return head;
    }

}
