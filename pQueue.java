
import java.util.*;

public class pQueue {

    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int count;

    public pQueue(int size) {
        this.queue = new int[size];
        this.front = -1;
        this.rear = 0;
        this.size = size;
        this.count = 0;
    }

    public void enque(int e) {
        if (count == size) {
            System.out.println("Queue is full");
            return;
        }
        int i = 0;
        for (i = rear; i > 0; i--) {
            if (queue[i - 1] <= e) {
                break;
            }
            if (queue[i - 1] > e) {
                queue[i] = queue[i - 1];
            }
        }
        queue[i] = e;
        rear = (rear + 1)%size;
        // queue[rear] = e;
        // rear = (rear + 1) % size;
        count++;

    }

    public String toString() {
        return Arrays.toString(queue);
    }

    public int deque() {
        if (count == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        front = (front + 1) % size;
        int value = queue[front];
        queue[front] = 0;
        count--;
        return value;
    }

}
