package LL;

public class InsertHead extends DisplayArr {
    public static Node insertHead(Node Head)
    {
        if(Head == null) return new Node(10);

        Node newHead = new Node(10);
        newHead.next=Head;
        return newHead;
    }
}
