package patterns.builder;

public class Kitchen {
    public static void main(String[] args) {
        DinnerBuilder builder = new ClassicDinner();
        Cook cook = new Cook(builder);
        Dinner dinner = cook.doesDinner();
        System.out.println(dinner);
    }
}
