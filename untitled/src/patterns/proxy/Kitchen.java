package patterns.proxy;

public class Kitchen {
    public static void main(String[] args) {
        Cooking dinner = new Dinner();
        dinner.run();

        System.out.println("\t");

        Cooking dinnerProxy = new DinnerProxy();
        dinnerProxy.run();
    }
}
