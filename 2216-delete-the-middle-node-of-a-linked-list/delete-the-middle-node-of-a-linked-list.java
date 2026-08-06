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
    public ListNode deleteMiddle(ListNode head) {
        ListNode current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        if(size==1)
        {
            return null;
        }
        int evenSize = 0;
        int oddsize = 0;
        System.out.println(size);
        if (size % 2 == 0) {
            evenSize = (size / 2) + 1;
            System.out.println("EVEN " + evenSize);
        } else {
            oddsize = (size + 1) / 2;
            System.out.println("ODD " + oddsize);
        }

        ListNode first = head;

        if (size % 2 == 0) {
            for (int i = 0; i < evenSize - 2; i++) {
                System.out.print(first.val + " ");
                first = first.next;

            }
            if (size != evenSize) {
                first.next = first.next.next;
            } else {
                first.next = null;
            }

        }

        else {
            for (int i = 0; i < oddsize - 2; i++) {
                System.out.print(first.val + " ");
                first = first.next;
            }
            if (size != oddsize) {
                first.next = first.next.next;
            } else {
                first.next = null;
            }
        }
        return head;
    }
}