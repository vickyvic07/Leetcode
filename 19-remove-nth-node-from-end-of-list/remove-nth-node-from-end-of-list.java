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
        ListNode cur=head;
        int i=0;
        while(cur!=null){
            cur=cur.next;
            i++;
        }
        int m=i-n;
        if(m==0){
            return head.next;
        }
        //ListNode s=head;
        cur=head;
        for(int j=0;j<m-1;j++){
            cur=cur.next;
        }
        cur.next=cur.next.next;
        return head;
    }
}