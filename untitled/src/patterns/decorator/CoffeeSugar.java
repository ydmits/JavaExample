package patterns.decorator;

public class CoffeeSugar extends CoffeeDecorator{
    public CoffeeSugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void consist() {
        super.consist();
        System.out.println("Сахар");
    }
}
