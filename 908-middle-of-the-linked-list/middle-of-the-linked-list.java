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
    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;

        }
        int mid = 0;
        if (size % 2 == 0) {
            mid = (size / 2) + 1;
        } else {
            mid = (size + 1) / 2;
        }
        while (mid-1 > 0 && head!=null) {
            head = head.next;
            mid--;
        }
       
        return head;
    }
}