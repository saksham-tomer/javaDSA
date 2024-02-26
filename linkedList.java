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

        if(head == null){
            head = node;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = node;
        }
        
    }
}