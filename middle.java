public class middle {
   if (head.next == null) return head;

    ListNode fast = head.next;
    
    while(fast != null && fast.next != null)
    {
        fast = fast.next.next;
        head = head.next;
    }
    if (fast == null) return head;

    return head.next;
}
}
return slow;
}