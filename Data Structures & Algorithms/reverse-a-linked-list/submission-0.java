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
        if(head==null)return head;
      ListNode prev=null,now=head,next=head.next;
      while(next!=null){
        now.next=prev;
        prev=now;
        now=next;
        next=next.next;
      }
      if(now!=null)now.next=prev;
      return now;

    }
}
