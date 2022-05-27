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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        
        ListNode d = head;
        int count = 1;
        while(d.next != null) {
            d = d.next;
            count += 1;
        }
        
        d.next = head;
        k = count - (k % count);
        while(k != 0) {
            d = d.next;
            k -= 1;
        }
        head = d.next;
        d.next = null;
        
        return head;
    }
}