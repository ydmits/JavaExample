package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {
        printSpace();
        Cat cat = new Cat();
        printSpace();
        Bear bear = new Bear();
        printSpace();
        Whale whale = new Whale();
        printSpace();
        Fish fish = new Fish();
        System.out.println("222");
        List<Integer> integers = new ArrayList<>();

    }

    public static void printSpace() {
        System.out.println("\t");
    }
}
