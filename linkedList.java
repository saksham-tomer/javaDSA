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
}