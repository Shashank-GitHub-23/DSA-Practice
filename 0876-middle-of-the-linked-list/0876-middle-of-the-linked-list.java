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
    public ListNode middleNode(ListNode head) {
        int count = 1;
        int pos = -1;
        ListNode curr = head;

        while(curr.next != null){
            curr = curr.next;
            count++;
        }
        if(count == 1 ) return head;
        if(count % 2 == 0){
            pos = count/2;
        }else{
            pos = (int)Math.ceil(count/2);
        }
        ListNode temp = head;

        for(int i=1; i<=pos; i++){
            temp = temp.next;
        }
        
        head = temp;
        return head;

    }
}