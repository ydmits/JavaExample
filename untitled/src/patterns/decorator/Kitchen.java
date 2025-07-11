package patterns.decorator;

public class Kitchen {
    public static void main(String[] args) {
        Coffee coffee = new CoffeeMilk(new CoffeeSugar(new NormalCoffee()));

        coffee.consist();
    }
}
