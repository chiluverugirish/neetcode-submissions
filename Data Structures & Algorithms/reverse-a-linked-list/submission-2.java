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
        if(head==null)return null;
        ListNode i=null,j=head,k=head.next;
        while(j.next!=null){
            j.next=i;
            i=j;
            j=k;
            k=k.next;
        }
        j.next=i;
        return j;
    }
}
