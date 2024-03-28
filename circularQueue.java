import java.util.*;

public class circularQueue {

    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int count;

    public circularQueue(int size) {
        this.queue = new int[size];
        this.front = -1;
        this.rear = 0;
        this.size = size;
        this.count = 0;
    }

    public void enque(int e) {

        if (count == size) {
            System.out.println("Queue is full");
        }
        queue[rear] = e;
        rear = (rear + 1) % size;
        count++;
    }

    public int deque() {
        if (count == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        front = (front + 1) % size;
        int val = queue[front];
        queue[front] = 0;
        count--;
        return val;
    }

    public String toString() {
        return Arrays.toString(queue);
    }

}
