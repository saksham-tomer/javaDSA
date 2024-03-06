import java.util.*;

class Node{
    public int data;
    public Node next = null;
    //next points to the address of the next node
    public Node(int data) {
        this.data = data;
    }
}

class MylinkedList{
    private Node head;

    public MylinkedList(){
        head = null;
    }

    public void insert(int value){
        Node node = new Node(value);
        //first create a new node with next always null
        //then link it to the next node
        //always two conditions
        if(head == null){
            //means linked list is empty
            head = node;
        }
        else{
            //for iteration purposes
            Node current = head;
            //move the current till the last node is encountered
            while(current.next != null){
                //while not null move a step forward until the last node is encountered
                current = current.next;
            }
            current.next = node;
        }
        
    }
    public String toString(){
        Node current = head;
        StringBuilder sb = new StringBuilder();
        while(current.next != null){
            sb.append(current).append("--->");
            current = current.next;
        }
        return sb.toString();
    }
    public void reverse(){
        Node prev = null;
        Node current = head;
        Node next = head.next;
        if(head == null || head.next == null)return;
        while(next != null){
            current.next = prev;
            prev = current;
            current = next;
            next = next.next;
        }
        current.next = prev;
        head = current;

    }
    public void removeFromStart(){
    if(isEmpty())return;

     Node temp = head;
     head = head.next;
     temp.next = null;
    }
    public void deleteFromEnd(){
        if(isEmpty())return;
        if(head == tail){
            head = tail = null;
            return;
        }
        Node current = head;
        while(current.next != tail){
            current = current.next;
        }
        current.next = null;
        tail = current

    }
    public void delFromNth(int n){
        int totalNode = 0;
        Node current = head;
        while(current  != null){
            totalNode++;
            current = current.next;
        }
        int indexFromStart = totalNode - n +1;
        Node prev = null;
        current = head;

        while(indexFromStart > 1 && current != null){
            prev = current;
            current = current.next;
            indexFromStart--;
        }


    }
    public void removeNthFromEnd(int n){
        if(isEmpty())return;
        if(head.next == null){
            head = null;
            return;
        }
        int count = 0;
        Node current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        int fromFront = count-n+1;
        Node prev = null;
        current = head;
        while(fromFront > 1 && current != null){
            prev = current;
            current = current.next;
            fromFront--;//dont get confused it is just an iterator 
            //the list start from the head and goes till the desired element
        }
       prev.next = current.next;
       current.next = null; 
    }
   public void removeNthAnotherApproach(int n){
    if(head == null)return;
    if(head.next == null){
        head = null;
        return;
    }
    Node fast = head;
    Node current = head;
    Node prev = null;

    while(n > 0 && fast != null){
        fast = fast.next;
        n--;
    }
    while(fast.next != null){
        current = current.next;
        prev = current;
        fast = fast.next;
   }
   prev.next = current.next;
   current.next = null;

}








