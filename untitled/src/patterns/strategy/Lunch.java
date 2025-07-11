package patterns.strategy;

public class Lunch implements Cooking{
    @Override
    public void cook() {
        System.out.println("Приготовил обед");
    }
}
