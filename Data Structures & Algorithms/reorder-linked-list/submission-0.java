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
    public void reorderList(ListNode head) {
        if(head==null ||head.next==null ||head.next.next==null)return;
        ListNode slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;fast=fast.next.next;
        }
       
        ListNode prev=null,curr=slow.next; 
        slow.next=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode d=new ListNode();
        ListNode ans=d;
        ListNode i=head,j=prev;
        while(i!=null && j!=null){
            d.next=i;i=i.next;
            d=d.next;
            
            d.next=j;j=j.next;
            d=d.next;
            
        }
        if(i!=null)d.next=i;
        if(j!=null)d.next=j;
        head=ans.next;
    }
}
