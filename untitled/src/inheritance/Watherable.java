package inheritance;

public interface Watherable {

    default void aquaLive() {
        System.out.println("Живу в воде");
    }
}
