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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head,tmp=null;
        ListNode d=new ListNode();
        d.next=head;
        while(n!=0){
            fast=fast.next;n--;
        }
        ListNode slow=d;
        
        while(fast!=null){
            fast=fast.next;slow=slow.next;
        }
        slow.next=slow.next.next;
        return d.next;
    }
}
