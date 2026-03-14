package LL;

public class InsertAtEnd extends DisplayArr {
    public static Node insertAtEnd(Node Head)
    {   Node temp=Head;


        while(temp.next!=null)
        {
            temp = temp.next;
        }
        Node n = new Node(90);
        temp.next=n;

        return Head;
    }
}
