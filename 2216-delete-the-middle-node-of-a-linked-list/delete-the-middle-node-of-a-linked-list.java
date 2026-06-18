class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null)
            return null;
        int count = 0;
        ListNode curr = head;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        int middle = count / 2;
        curr = head;
        for(int i = 0; i < middle - 1; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}