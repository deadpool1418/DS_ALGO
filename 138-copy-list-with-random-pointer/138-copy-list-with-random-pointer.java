/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return head;
        Node iter = head;
        Node front = head;
        while(iter != null) {
            front = iter.next;
            Node node = new Node(iter.val);
            iter.next = node;
            node.next = front;
            iter = front;
        }
        iter = head;
        while(iter != null) {
            if(iter.random != null) {
                iter.next.random = iter.random.next;
            }
            iter = iter.next.next;
        }
        iter = head;
        Node dummyHead = new Node(0);
        Node copy = dummyHead;
        while(iter != null) {
            front = iter.next.next;
            copy.next = iter.next;
            iter.next = front;
            copy = copy.next;
            iter = iter.next;
        }
        return dummyHead.next;
    }
}