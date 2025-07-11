package inheritance;

public class Cat extends Mammal{
    private Wool wool;

    public Cat() {
        super();
        System.out.println("Я - кошка");
        wool = new Wool();
    }
}
