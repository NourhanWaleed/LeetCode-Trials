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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode current = head, q = current.next, p=q.next;
        current.next = null;
        while(p != null){
            q.next = current;
            current = q;
            q = p;
            p = p.next;
        }
        q.next = current;
        return q;
    }
}

// I was asked this question in an interview before