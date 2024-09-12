/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
       ListNode temp = node;
       ListNode prev = null;

       while(temp.next != null){
        int n = temp.next.val;
        temp.val = n;
        prev = temp;
        temp = temp.next;
       }
       prev.next = null;

    }
}