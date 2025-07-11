package patterns.strategy;

public class Kitchen {
    public static void main(String[] args) {
        Human human = new Human();

        human.setCooking(new Breakfast());
        human.executeCooking();

        human.setCooking(new Lunch());
        human.executeCooking();

        human.setCooking(new Dinner());
        human.executeCooking();
    }
}
