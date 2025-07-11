package inheritance;

public class Fish extends Animal implements Watherable {

    public Fish() {
        super();
        System.out.println("Я - рыба");
        aquaLive();
    }
}
