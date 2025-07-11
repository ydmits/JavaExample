package patterns.strategy;

public class Dinner implements Cooking{
    @Override
    public void cook() {
        System.out.println("Приготовил ужин");
    }
}
