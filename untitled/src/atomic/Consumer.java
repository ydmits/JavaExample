package atomic;

import java.util.concurrent.ConcurrentLinkedQueue;

class Consumer implements Runnable {

    ConcurrentLinkedQueue<String> queue;
    Consumer(ConcurrentLinkedQueue<String> queue){
        this.queue = queue;
    }

    public void run() {
        String str;
        System.out.println("Класс для получения элементов из очереди");
        for (int x = 0; x < 5; x++) {
            while ((str = queue.poll()) != null) {
                System.out.println("Вытянули: " + str);
            }
            try {
                Thread.sleep(600);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }
}
