package patterns.decorator;

public abstract class CoffeeDecorator implements Coffee {
    Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void consist() {
        coffee.consist();
    }
}
