package patterns.decorator;

public class NormalCoffee implements Coffee{

    @Override
    public void consist() {
        System.out.println(
                "Напиток состоит из:\n" +
                "Растворимый кофе\n" +
                "Вода");
    }
}
