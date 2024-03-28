import java.util.*;

public class queue {
   public static void main(String[] args) {
      Queue<Integer> queue = new ArrayDeque<>();
      queue.add(1); // enque
      queue.offer(2); // similar to add but does not throw and exception if empty
      queue.offer(3); // returns null if empty
   }
}
// you can implement queue of various forms like priority queue, based on linked
// lists ets