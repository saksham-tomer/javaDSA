
import java.util.*;

public class myQueue {

    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public myQueue(int size) {
        this.queue = new int[size];
        this.front = 0;
        this.rear = 0;
        this.size = size;
    }

    public void enque(int e) {
        if (rear == size) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear] = e;
        rear++;

    }

    public String toString() {
        return Arrays.toString(queue);
    }

}
