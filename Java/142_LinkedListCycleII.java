/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

 //Floyd's Tortoise and Hare algorithm
 class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slowNode = head;
        ListNode fastNode = head;

        //loop until a cycle or end of list was found
        while(fastNode != null && fastNode.next != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if(slowNode == fastNode){
                break;
            }
        }

        //check if there is a cycle
        if(fastNode == null || fastNode.next == null){
            return null;    //no cycle
        }

        //reset slowNode pointer to find where cycle begins
        slowNode = head;
        while(slowNode != fastNode){
            slowNode = slowNode.next;
            fastNode = fastNode.next;
        }
        return slowNode;
    }
}