package atomic;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ConcurrentLinkedQueue<Task> queue = new ConcurrentLinkedQueue<>();
        queue.add(new Task(1,0));
        queue.add(new Task(1,1));
        queue.add(new Task(1,2));
        queue.add(new Task(1,3));

        for (Task task : queue) {
            new Thread(task).start();

        }



    }

}
