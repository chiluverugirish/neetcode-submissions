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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode d=new ListNode();
        ListNode ans=d;
        ListNode i=list1,j=list2;
        while(i!=null && j!=null){
            if(i.val>j.val){
                d.next=j;d=d.next;
                if(j!=null)j=j.next;
            }
            else{
                d.next=i;d=d.next;
                if(i!=null)i=i.next;
            }
        }
        while(i!=null){
            d.next=i;
            d=d.next;
            if(i!=null)i=i.next;
        }
        while(j!=null){
            d.next=j;
            d=d.next;
            if(j!=null)j=j.next;
        }
        return ans.next;
    }
}