package atomic;

public class Task implements Runnable{
    int a;
    int b;

    public Task(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println(a + b);
    }
}
