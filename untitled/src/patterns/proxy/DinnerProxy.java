package patterns.proxy;

public class DinnerProxy  implements Cooking{
    Dinner dinner;

    @Override
    public void run() {
        System.out.println("Пришло время обеда");

        if (dinner == null) dinner = new Dinner();

        System.out.println("Добавили специи");

        dinner.run();
    }
}
