package fromJavaRush.tasks;

public class Thread2 {
    public static void main(String[] args) {
        MyThread myThread = new Thread2().new MyThread("super secret key");
        myThread.start();
    }

    public class MyThread extends Thread {
        private String secretKey;

        public MyThread(String secretKey) {
            this.secretKey = secretKey;
            setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
//            setDaemon(true);
        }

        @Override
        public void run() {
            throw new NullPointerException("it's an example");
        }

        private class MyUncaughtExceptionHandler implements UncaughtExceptionHandler {

            @Override
            public void uncaughtException(Thread t, Throwable e) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e1) {
                }
                System.out.println(String.format("%s, %s, %s", MyThread.this.secretKey, t.getName(), e.getMessage()));
            }
        }
    }
}
