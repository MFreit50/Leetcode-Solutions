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
        ListNode current = head;
        ListNode previous = null;
        while(current != null){
            //nextNode stores next position in head
            ListNode nextNode = current.next;
            //current.next links to head of previous
            current.next = previous;
            //previous updates head to current
            previous = current;
            //current returns to head
            current = nextNode;
        }
        return previous;
    }
}