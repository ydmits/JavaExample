package patterns.proxy;

public class Dinner implements Cooking{

    public Dinner() {
        System.out.println("Включили плиту");
        System.out.println("Взяли продукты");
        System.out.println("Приотовили обед");
    }

    @Override
    public void run() {
        System.out.println("Во время обеда всё съели");
    }
}
