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
    public ListNode swapNodes(ListNode head, int k) {
        int size = getSize(head);
        ListNode first = head;
         ListNode second = head;

         for (int i = 1; i < k; i++) {
            first = first.next;
        }

        
        for (int i = 1; i < size - k + 1; i++) {
            second = second.next;
        }

          int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return head;
    }

    public int getSize(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}