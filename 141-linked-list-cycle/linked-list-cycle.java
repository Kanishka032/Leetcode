/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        //if first and slow meet there is a cycle
        // no null
        ListNode fast = head;
        ListNode slow = head;

        while (fast!= null && fast.next != null) {
fast=fast.next.next;
slow=slow.next;

if(fast==slow)
{
    return true;
}
        }

        return false;
    }
}