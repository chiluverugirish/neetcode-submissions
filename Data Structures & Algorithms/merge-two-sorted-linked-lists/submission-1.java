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
        ListNode i=list1,j=list2,ans=new ListNode(-1);
        ListNode tmp=ans;
        while(i!=null&&j!=null){
            if(i.val>j.val){
                ans.next=new ListNode(j.val);
                // ans.next=j;
                j=j.next;
            }else{
                ans.next=new ListNode(i.val);
                // ans.next=i;
                i=i.next;
            }ans=ans.next;
        }
        if(i!=null)ans.next=i;
        if(j!=null)ans.next=j;
        
        return tmp.next;
    }
}