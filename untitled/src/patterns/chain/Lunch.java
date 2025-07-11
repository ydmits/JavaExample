package patterns.chain;

public class Lunch extends Cooking{
    public Lunch(Times priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("На обед приготовил " + message);
    }
}
