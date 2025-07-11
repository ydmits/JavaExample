package inheritance;

public abstract class Mammal extends Animal {
    private Snipe snipe;

    public Mammal( ) {
        super();
        System.out.println("Я - млекопитающее");
        snipe = new Snipe();
    }
}
