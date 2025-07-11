package patterns.chain;

public class Breakfast extends Cooking{

    public Breakfast(Times priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("На завтрак приготовил " + message);
    }
}
