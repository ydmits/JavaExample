package inheritance;

public class Whale extends Mammal implements Watherable{

    public Whale() {
        super();
        System.out.println("Я - кит");
        aquaLive();
    }
}