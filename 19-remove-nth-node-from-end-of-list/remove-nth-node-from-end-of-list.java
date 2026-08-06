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
    public ListNode removeNthFromEnd(ListNode head, int k) {
        ListNode Current = head;
        int size = 0;
        while (Current != null) {
            size++;
            Current = Current.next;
        }
        if (k == size) {
            return head.next;
        }
        System.out.println("Size :" + size);
        ListNode first = head;
        for (int i = 0; i < (size - k) - 1; i++) {

            System.out.println("value of i :" + i + " value :" + first.val);
            first = first.next;

        }
        first.next = first.next.next;

        return head;
    }
}