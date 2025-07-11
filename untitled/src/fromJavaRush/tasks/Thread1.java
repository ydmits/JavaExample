package fromJavaRush.tasks;

public class Thread1 {
    public static void processThreads(Thread... threads) {
        //implement this method - реализуйте этот метод
        for (Thread thread : threads) {
            switch (thread.getState()) {
                case NEW: thread.start(); break;
                case WAITING:
                case TIMED_WAITING:
                case BLOCKED:
                    thread.interrupt(); break;
                case RUNNABLE: thread.isInterrupted(); break;
                case TERMINATED: System.out.println(thread.getPriority()); break;
            }
        }
    }

    public static void main(String[] args) {
    }
}
