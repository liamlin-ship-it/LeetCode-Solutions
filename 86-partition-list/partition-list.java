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
    public ListNode partition(ListNode head, int x) {
        ListNode smallDummy = new ListNode(-1);
        ListNode smallCurr = smallDummy;

        ListNode largeDummy = new ListNode(-1);
        ListNode largeCurr = largeDummy;

        ListNode curr = head;

        while (curr != null){
            if (curr.val < x){
                smallCurr.next = curr;
                smallCurr = smallCurr.next;
            }else {
                largeCurr.next = curr;
                largeCurr = largeCurr.next;
            }

            curr = curr.next;
        }

        largeCurr.next = null;

        smallCurr.next = largeDummy.next;

        return smallDummy.next;
    }
}