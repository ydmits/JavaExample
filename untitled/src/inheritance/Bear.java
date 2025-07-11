package inheritance;

public class Bear extends Mammal{
    Wool wool;

    public Bear() {
        super();
        System.out.println("Я - медведь");
        wool = new Wool();
    }
}
