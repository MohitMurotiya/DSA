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
        ListNode listA = headA, listB = headB;
        while (listA != listB) {
            listA = listA == null ? headB : listA.next; // move to B after finishing A
            listB = listB == null ? headA : listB.next; // move to A after finishing B
        }
        return listA;
    }
}