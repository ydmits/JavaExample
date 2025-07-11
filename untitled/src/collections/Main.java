package collections;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyHashSet<Integer> myHashSet = new MyHashSet<>();
        myHashSet.add(0,16,32,21,24,25,26,27,28,100,100);
        myHashSet.remove(0,25,29,27, 120);

        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.addAll(List.of("BB", "CC", "DD"));
        myLinkedList.add(0,"AA");
        myLinkedList.add(0, "AA");
        String aa = myLinkedList.get(1);
        String bb = myLinkedList.remove(2);

        List<Student> students = Student.getContent();

        students.stream()
                .peek(System.out::println)
                .flatMap(s -> s.getBooks().stream())
                .sorted()
                .distinct()
                .filter(b -> b.getYear() > 2000)
                .limit(3)
                .map(book -> book.getYear())
                .filter(y -> y == 2010)
                .findFirst()
                .ifPresentOrElse(
                        y -> System.out.println("Книга с таким годом выпуска найдена - " + y),
                        () -> System.out.println("Книга с таким годом выпуска не найдена")
                );
    }
}