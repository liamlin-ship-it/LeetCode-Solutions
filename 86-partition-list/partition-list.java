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
                // if ir's smaller than x,
                // then put it to the smallCurr
                smallCurr.next = curr;
                // move forward to be ready for the next one
                smallCurr = smallCurr.next;
            }else {
                largeCurr.next = curr;
                largeCurr = largeCurr.next;
            }

            // main pointer moves to the next person
            curr = curr.next;
        }

        // end the last largeCurr with null,
        // so it won't keep loop through the next one
        largeCurr.next = null;

        // connect the end of small list to
        // the REAL start of large list
        smallCurr.next = largeDummy.next;

        // return the real first person of the new list
        return smallDummy.next;
    }
}