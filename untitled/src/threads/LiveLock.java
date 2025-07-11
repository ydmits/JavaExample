package threads;

public class LiveLock {
    public static void main(String[] args) {
        Person person1 = new Person("person1");
        Person person2 = new Person("person2");

        new Thread(() -> person1.goFirst(person2)).start();
        new Thread(() -> person2.goFirst(person1)).start();
    }
}

class Person {
    private String name;
    private boolean isReady = false;

    public Person(String name) {
        this.name = name;
    }

    public synchronized void goFirst(Person person) {
        while (true) {
            System.out.println(this.name + " - ты иди первый " + person.name);

            isReady = true;

            if (person.isReady) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                continue;
            }

            person.acceptPass(this);
        }
    }

    public synchronized void acceptPass(Person person) {
        isReady = false;
        System.out.println(name + " - нет " + person.name + " ты иди первый!");
    }
}

