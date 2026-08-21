// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */

// class Solution {
//     static ListNode ans=null;
//     static ListNode rev(ListNode node,ListNode prev,int k){
        
//         ListNode cur=node;
//         ListNode next=node.next;
//         while(k>1&&cur.next!=null){
//             cur.next=prev;
//             prev=cur;cur=next;next=next.next;k--;
//         }
//         cur.next=prev;
//         node.next=next;
//         ListNode tmp=cur;
//         while(tmp!=null){System.out.print(tmp.val+" ");tmp=tmp.next;}
//         System.out.println();
//         if(prev==null)ans=node;
//         return cur;
//     }
//     public ListNode reverseKGroup(ListNode head, int k) {
//         ListNode c=head;int k1=k;
//         ListNode r=null;
//         ListNode prev=null;
//         while(c!=null){
//             if(c==head)rev(c,prev,k);
//             else c=rev(c.next,c,k);
//             if(c.next==null)break;
//         }
//         return ans;
//     }
// }
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        // Check if k nodes exist
        ListNode temp = head;
        for (int i = 0; i < k; i++) {
            if (temp == null) return head;
            temp = temp.next;
        }

        // Reverse first k nodes
        ListNode prev = null;
        ListNode cur = head;

        for (int i = 0; i < k; i++) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        // Recursively reverse remaining groups
        head.next = reverseKGroup(cur, k);

        return prev;
    }
}