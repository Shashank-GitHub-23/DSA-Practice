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
    public ListNode oddEvenList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        if(head == null || head.next == null){
            return head;
        }
    
        ListNode temp = head;

        while(temp != null && temp.next != null){
            list.add(temp.val);
            temp = temp.next.next;
        }
        if(temp != null) list.add(temp.val);
        
        temp = head.next;

        while(temp != null && temp.next != null){
            list.add(temp.val);
            temp = temp.next.next;
        }
        temp = head;
        for(int k : list){
           temp.val = k;
           temp = temp.next;
        }
        return head;
    }
}