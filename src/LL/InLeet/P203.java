package LL.InLeet;

public class P203 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode removeElements(ListNode head, int val) {

            ListNode prev = null;
            ListNode temp = head;

            if (head == null)
                return null;
            while (temp != null && head.val==val) {
                if (head.val == val) {
                    head = head.next;
                }
                temp = temp.next;
            }

            while (temp != null) {
                if (temp.val == val) {
                    prev.next = temp.next;

                } else {
                    prev = temp;
                }
                temp = temp.next;

            }
            return head;
        }
    }
}
