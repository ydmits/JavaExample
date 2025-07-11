package atomic;

import java.util.concurrent.ConcurrentLinkedQueue;

class Producer implements Runnable {

    ConcurrentLinkedQueue<Task> queue;
    Producer(ConcurrentLinkedQueue<Task> queue){
        this.queue = queue;
    }
    public void run() {

    }
}
