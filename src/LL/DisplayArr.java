package LL;

public class DisplayArr {
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print( " -> "+ temp.data);
            temp = temp.next;
        }
    }

}
