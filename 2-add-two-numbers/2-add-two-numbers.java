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
        int s = 0, c = 0;
        ListNode head = new ListNode();
        ListNode temp = head;
        while(l1 != null || l2 != null || c == 1) {
            s = 0;
            if(l1 != null){
                s += l1.val;
                l1 = l1.next;
            }
            
            if(l2 != null) {
                s += l2.val;
                l2 = l2.next;
            }
            
            s += c;
            c = s / 10;
            ListNode node = new ListNode(s % 10);
            temp.next = node;
            temp = temp.next;
        }
        
        return head.next;
    }
}