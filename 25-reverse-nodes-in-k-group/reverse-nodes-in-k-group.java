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
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode current = head;
        int size = 0;
        while (current != null && size < k) {
            size++;
            current = current.next;
        }

        if (size == k) {
            ListNode prev = reverseKGroup(current, k);
            while (size-- > 0) {
                ListNode temp = head.next;
                head.next = prev;
                prev = head;
                head = temp;
            }

            head = prev;
        }
        return head;
    }
}