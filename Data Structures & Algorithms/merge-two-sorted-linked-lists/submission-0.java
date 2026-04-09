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
        ListNode tmp=new ListNode(0),i=list1,j=list2,ans=null;
        if(i==null)return j;
        if(j==null)return i;
        if(i.val>j.val){tmp.next=j;ans=tmp.next;}else{tmp.next=i;ans=tmp.next;}
        while(i!=null&&j!=null){
            if(i.val>j.val){
                tmp.next=j;
                j=j.next;
                tmp=tmp.next;
            }
        else{
            tmp.next=i;
            i=i.next;
            tmp=tmp.next;
        }
        }
        if(i!=null)tmp.next=i;
        if(j!=null)tmp.next=j;
        return ans;
    }
}