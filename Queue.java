import java.util.LinkedList;
import java.util.Queue;

class Queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("furkhan");
        queue.add("Ezhil");
        queue.add("Kavin");
        queue.add("Akash");

        System.out.println("Queue: " + queue);

        // front element
        System.out.println("Front Element: " + queue.peek());

        // Dequeue element
        System.out.println("Dequeued Element: " + queue.remove());

        // Check if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());

        // Size of queue
        System.out.println("Queue size: " + queue.size());

        // Full queue
        System.out.println("Final Queue: " + queue);
    }
}
