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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // when fast reaches the last node,
        // slow stops at the node before the one
        // we want to delete
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        // skip n-th node from the end
        slow.next = slow.next.next;

        return dummy.next;
    }
}