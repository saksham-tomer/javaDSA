import java.util.*;;

public class queueUsingStack {
    private Stack<Integer> s1 = new Stack<Integer>();
    private Stack<Integer> s2 = new Stack<Integer>();

    public queueUsingStack() {
        this.s1 = new Stack<>();
        this.s2 = new Stack<>();
    }

    public void enque(int val) {

        s1.push(val);
    }

    public int deque() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();

    }

}
