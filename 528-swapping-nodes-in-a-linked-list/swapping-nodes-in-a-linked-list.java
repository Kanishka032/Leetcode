
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
import java.util.*;

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        // System.out.println(head.size());
        int size = 0;
        ListNode current = head;
        while (current != null) {
            size++;

            current = current.next;
        }
       

        // ListNode first = head;
        ListNode first = head;
        for (int i = 1; i < k; i++) {
            first = first.next;
        }
        ListNode s = head;
        for (int i = 1; i < (size-k)+1; i++) {
            s = s.next;
        }
        int temp=first.val;
        first.val=s.val;
        s.val=temp;

        System.out.println(first.val);
        System.out.println(s.val);
        System.out.println(size);
        return head;
    }
}