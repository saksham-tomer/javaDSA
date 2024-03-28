

import java.util.*;

public class DoubleEndedDeque {
   
    private int front;
    private int rear;
    private int[]deque;
    private int count;
    private int size;

    DoubleEndedDeque(int size){
        this.size = size;
        this.deque = new int[size];
        this.front = -1;
        this.rear = 0;
        this.count = 0;
    }

    public void pushFront(int val){
        if(count == size){
            System.out.println("Queue is full");
        }

        front = (front )
    }

}
