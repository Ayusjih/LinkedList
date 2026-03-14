package LL;

public class InsertAtK extends DisplayArr {

    public static Node InsertAtk(Node head, int k, int value)
    {   Node temp = head;


        if(head == null)
        {
            if(k==1)
            {
                Node n = new Node(value);
                return n;
            }
            else return null;
        }
        if(k==1)
        {
            Node n = new Node(value);
            n.next = head;
            return n;
        }


        int count =0;
        while(temp!=null)
        {
            count++;
            if(count ==k-1)
            {
                Node n = new Node(value);
                n.next= temp.next;
                temp.next=n;
                break;
            }
            temp = temp.next;

        }
        return head;
    }

}
