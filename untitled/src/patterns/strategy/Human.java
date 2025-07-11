package patterns.strategy;

public class Human {
    private Cooking cooking;

    public void setCooking(Cooking cooking) {
        this.cooking = cooking;
    }

    public void executeCooking() {
        cooking.cook();
    }
}
