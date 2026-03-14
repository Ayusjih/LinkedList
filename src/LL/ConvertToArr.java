package LL;

public class ConvertToArr extends DisplayArr {
    public static Node convertToLL(int [] arr) {
        int n = arr.length;
        Node n1 = new Node(arr[0]);
        Node head = n1;
        for (int i = 1; i < n; i++) {
            Node temp = new Node(arr[i]);
            n1.next = temp;
            n1 = temp;
        }
        return head;
    }
}
