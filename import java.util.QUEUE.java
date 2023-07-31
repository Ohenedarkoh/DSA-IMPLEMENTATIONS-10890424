import java.util.LinkedList;

public class QueueDemo {

    public static void main(String[] args) {
        // Create a queue of integers
        LinkedList<Integer> queue = new LinkedList<>();

        // Enqueue some elements onto the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Dequeue the elements from the queue
        System.out.println(queue.remove()); // 10
        System.out.println(queue.remove()); // 20
        System.out.println(queue.remove()); // 30

        // Check if the queue is empty
        if (queue.isEmpty()) {
            System.out.println("The queue is empty");
        } else {
            System.out.println("The queue is not empty");
        }
    }
}
