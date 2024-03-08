class Solution{
public ListNode swapPairs(ListNode head){
   if(head == null || head.next == null)  return head;

   ListNode restOfTheList = swapPairs(head.next.next);
   
   ListNode second = head.next;
   second.next = head;
   head.next = restOfTheList;
   
   return second;
}

}

