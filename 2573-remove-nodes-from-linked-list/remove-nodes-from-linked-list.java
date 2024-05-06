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
    public ListNode removeNodes(ListNode head) {
        if(head==null) return null;

        ListNode curr = head;
        ListNode nxtG = removeNodes(head.next);

        curr.next = nxtG;

        if(nxtG==null || curr.val >= nxtG.val) return curr;

        return nxtG;
    }
}