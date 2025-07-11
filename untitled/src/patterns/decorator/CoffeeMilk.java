package patterns.decorator;

public class CoffeeMilk extends CoffeeDecorator{
    public CoffeeMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void consist() {
        super.consist();
        System.out.println("Молоко");
    }
}
