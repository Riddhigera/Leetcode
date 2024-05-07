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
    public ListNode doubleIt(ListNode head) {
        ListNode rev = reverseLL(head);
        ListNode temp = rev;
        ListNode ans = new ListNode(0);
        ListNode curr = ans;
        int carry = 0;
        while(temp!=null){
            int value = temp.val;
            int sum = value * 2  + carry;
            ListNode t = new ListNode((sum) % 10);
            carry = sum/10;
            curr.next = t;
            curr = curr.next;
            temp = temp.next;
        }
        if(carry > 0){
            curr.next = new ListNode(carry);
        }
        return reverseLL(ans.next);
    }
    public ListNode reverseLL(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode nxt = head;
        while(curr!=null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
}