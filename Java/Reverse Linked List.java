/*
 LeetCode 206. Reverse Linked List
 Example:
 Input: 1->2->3->4->5->NULL
 Output: 5->4->3->2->1->NULL
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution 
{
    public ListNode reverseList(ListNode head) 
    {
        ListNode prev = null;
        ListNode next = null;
        while (head != null)
        {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;        
    }
}
