package threads;

public class Print1_2 {
    private static final Object lock = new Object();
    private static boolean needPrint1 = true;

    public static void main(String[] args) {
        new Thread(() -> printNumber(1)).start();
        new Thread(() -> printNumber(2)).start();
    }

    private static void printNumber(int number) {
        while (true) {
            synchronized (lock) {
                try {
                    while ((number == 1 && !needPrint1) ||
                            (number == 2 && needPrint1)) {
                        lock.wait();
                    }

                    System.out.println(number);
                    needPrint1 = !needPrint1;
                    lock.notify();

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
