package patterns.strategy;

public class Breakfast  implements Cooking{
    @Override
    public void cook() {
        System.out.println("Приготовил завтрак");
    }
}
