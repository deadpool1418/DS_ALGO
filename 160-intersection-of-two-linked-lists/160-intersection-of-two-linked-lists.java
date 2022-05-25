/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        
        ListNode a = headA;
        ListNode b = headB;
        int diff = 0, l1 = 0, l2 = 0;
        while(a!= null){
            l1++;
            a = a.next;
        }
        while(b != null) {
            l2++;
            b = b.next;
        }
        diff = l1 - l2;
        if(diff < 0) {
            while(diff != 0) {
                headB = headB.next;
                diff++;
            }
        }
        else {
            while(diff > 0) {
                headA = headA.next;
                diff--;
            }
        }
            while(headA != null) {
                if(headA == headB) return headA;
                headA = headA.next;
                headB = headB.next;
            }
        return null;
    }
}