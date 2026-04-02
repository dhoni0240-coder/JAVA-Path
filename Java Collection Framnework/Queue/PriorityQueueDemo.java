package Queue;
import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        // Creating PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements
        pq.add(50);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        System.out.println("Queue: " + pq);

        // Peek (top element)
        System.out.println("Peek: " + pq.peek());

        // Removing elements (FIFO based on priority)
        System.out.println("Removed: " + pq.poll());
        System.out.println("After removal: " + pq);

        // Size
        System.out.println("Size: " + pq.size());

        // Iterating
        System.out.println("Iterating:");
        for (int num : pq) {
            System.out.println(num);
        }

        // Removing all elements
        while (!pq.isEmpty()) {
            System.out.println("Removing: " + pq.poll());
        }
    }
}