public class removeDuplicates {
   public ListNode remove(ListNode head) {
    if(head == null || head.next == null) return head;
    ListNode current = head;
    while(current != null && current.next != null) {
        ListNode next = current.next; 
        if(current.val == next.val){
            current.next = next.next;
            next.next = null;
        }
        current = current.next;

   }
   return head;
}
