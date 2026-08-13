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
        int c=0,a=0;
        if(head==null)return head;
        ListNode tmp=head;
        while(tmp!=null){tmp=tmp.next;c++;}
        ListNode pr=null;
        tmp=head;
        while(c-n!=a){
            a++;
            pr=tmp;
            tmp=tmp.next;
        }
        if(pr==null)return tmp.next;

        pr.next=tmp.next;
        tmp.next=null;
        return head;
    }
}
