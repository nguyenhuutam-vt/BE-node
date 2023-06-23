import java.util.LinkedList;
import java.util.Queue;

public class Queuee {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        //add elements
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");

        //get the size of the queue
        int size = queue.size();
        System.out.println("Size of queue " + size);

        //check if the queue
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue " +isEmpty);

        //Access the element at the front of the queue without removing it
        String frontElement = queue.peek();
        System.out.println("Front element of the queue " + frontElement);

        //process element in the queue ( remove )
        while (!queue.isEmpty()){
            String element = queue.poll();
            System.out.println("Processing element " +element);

        //check the size of the queue after proccessing
            System.out.println("Size of the queue after proccessing " +queue.size());
        }
    }
}
