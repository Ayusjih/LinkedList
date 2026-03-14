package LL;
import java.util.Scanner;
import LL.ConvertToArr;
import LL.DisplayArr;
import LL.RemoveByKOrValue;

import static LL.InsertAtEnd.insertAtEnd;
import static LL.InsertAtK.InsertAtk;
import static LL.InsertHead.insertHead;
import static LL.RemoveByKOrValue.removeByValue;
import static LL.RemoveByKOrValue.removeKthPosition;

class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;

    }
}

public class LL extends ConvertToArr{

    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
        int[] arr = {12,23,3,1,5,7,3};
        Node head = convertToLL(arr);
        display(head);
        System.out.println();

      //  int k = sc.nextInt();// for removeKthPosition
        //int value = sc.nextInt(); //for  removeByValue
        //head = removeKthPosition(head,k);
       // head = removeByValue(head,value);
        //head = insertHead(head); //for insert Newhead
        //head = insertAtEnd(head);
        int value =sc.nextInt();
        head =InsertAtk(head,1,value);
        display(head);
    }
}
