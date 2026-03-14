package LL;

public class RemoveByKOrValue extends DisplayArr{
    public static Node removeKthPosition(Node head,int k)
    {
        if(head == null) return null;
        if(k==1) return head.next;
        int count =0;
        Node prev = null;
        Node temp = head;

        while(temp!=null)
        {   count++;
            if(count ==k)
            {
                prev.next = temp.next;
                break;
            }
            prev =temp;
            temp=temp.next;
        }
        return head;

    }

    public static Node removeByValue(Node head,int value)
    {
        if(head == null) return null;
        if(value==1) return head.next;
        // int count =0;
        Node prev = null;
        Node temp = head;
        while(temp!=null)
        {
            if(temp.data ==value)
            {
                prev.next = temp.next;
                break;
            }
            prev =temp;
            temp=temp.next;
        }
        return head;

    }

}
