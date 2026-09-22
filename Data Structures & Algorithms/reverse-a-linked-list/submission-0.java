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
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            // 1. Save the next node so we don't lose the rest of the list
            ListNode nextNode = curr.next; 
            
            // 2. Reverse the current node's pointer to point backwards
            curr.next = prev; 
            
            // 3. Move 'prev' forward to the current node
            prev = curr; 
            
            // 4. Move 'curr' forward to the saved next node
            curr = nextNode; 
        }

        // 'prev' will be pointing to the new head of the reversed list
        return prev;
    }
}
