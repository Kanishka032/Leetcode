class Solution {
    public boolean isPalindrome(ListNode head) {
        // Step 1: create a copy
        ListNode copy = copyList(head);

        // Step 2: reverse the copy
        ListNode reversed = reverseList(copy);

        // Step 3: compare both lists
        ListNode p1 = head;
        ListNode p2 = reversed;

        while (p1 != null && p2 != null) {
            if (p1.val != p2.val) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }

    private ListNode copyList(ListNode head) {
        if (head == null) return null;

        ListNode newHead = new ListNode(head.val);
        ListNode temp = newHead;
        ListNode curr = head.next;

        while (curr != null) {
            temp.next = new ListNode(curr.val);
            temp = temp.next;
            curr = curr.next;
        }

        return newHead;
    }

    // reverse list
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}