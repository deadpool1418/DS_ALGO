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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        
        ListNode fast = head, slow = head;
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        slow.next = reverseList(slow.next);
        slow = slow.next;
        
        while(slow != null) {
            if(slow.val != head.val) return false;
            slow = slow.next;
            head = head.next;
        }
        
        return true;
        
    }
    
    ListNode reverseList(ListNode head) {
        ListNode prev = null, next = null;
        while(head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}