public class Solution {
        public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public static Node quickSort(Node head) {
        if (head == null || head.next == null)
            return head;

        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        int[] arr = new int[length];
        current = head;
        int index = 0;
        while (current != null) {
            arr[index++] = current.value;
            current = current.next;
        }

        quickSort(arr, 0, length - 1);

        current = head;
        for (int num : arr) {
            current.value = num;
            current = current.next;
        }

        return head;
    }
}

