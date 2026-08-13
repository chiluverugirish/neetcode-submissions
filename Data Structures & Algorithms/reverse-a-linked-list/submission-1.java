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
        ListNode b=null,p=head,f=head.next;
        while(p.next!=null){
            p.next=b;
            b=p;
            p=f;
            f=f.next;
        }
        p.next=b;
        return p;
    }
}
