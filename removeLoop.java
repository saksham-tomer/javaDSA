import java.util.Set;

public class removeLoop {
  public ListNode remove(ListNode head)  {
    if(head.next == null || head == null) return head;
    ListNode prev= null;
    ListNode current = head;
    Set<Integer> set = new HashSet<Integer>();
    set.add(current);
    while(current != null) {
      prev = current;
      current = current.next;
     if(set.contains(current)) {
      current.next = null;
      return head;
     }
     set.add(current);
    }
    return head;
    
  }
}
