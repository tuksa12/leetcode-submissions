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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        if((l1 != null) || (l2 != null)) {
            result = new ListNode(0);
            if (l1 == null) {
                l1 = new ListNode(0);
            }
            if (l2 == null) {
                l2 = new ListNode(0);
            }
            result.val += l1.val + l2.val;
            if (result.val > 9) {
                result.val = result.val - 10;
                if (l1.next == null) {
                l1.next = new ListNode(1);
                } else {
                    l1.next.val ++;
                }
            }
            result.next = addTwoNumbers(l1.next, l2.next);
        }
        return result;
    }
}