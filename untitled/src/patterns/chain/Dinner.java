package patterns.chain;

public class Dinner extends Cooking{
    public Dinner(Times priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("На ужин приготовил " + message);
    }
}
