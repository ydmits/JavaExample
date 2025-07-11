package threads;

public class DeadLock {
    private static final Object srs1 = new Object();
    private static final Object srs2 = new Object();

    public static void main(String[] args) {
        Runnable task1 = () -> {
            synchronized (srs1) {
                System.out.println("task1 - srs1");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("task 1 wait for srs2");

                synchronized (srs2) {
                    System.out.println("task1 - srs2");
                }
            }
        };

        Runnable task2 = () -> {
            synchronized (srs2) {
                System.out.println("task2 - srs2");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("task 2 wait for srs1");

                synchronized (srs1) {
                    System.out.println("task1 - srs1");
                }
            }
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }
}
