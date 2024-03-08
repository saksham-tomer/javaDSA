class Solution{

 public ListNode reverseKGroup(ListNode head,int K) {
    if(head == null || head.next == null) return head;

    ListNode prev = null;
    ListNode current = head;
    ListNode next = null;
    int count = 0;
    while(count < K && current != null){
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
        count++;
    }

    ListNode remaining = reverseKGroup(current, K);
    head.next = remaining;

    return prev;

 }

}