package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private List<Book> books;

    public Student(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return Objects.equals(name, books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, books);
    }

    @Override
    public String toString() {
        return String.format("Student %s %s ",name, books);
    }

    public static List<Student> getContent() {
        List<Student> students = new ArrayList<>();

        Book book1 = new Book("Одиссея", 538, 1980);
        Book book2 = new Book("Илиада", 235, 1990);
        Book book3 = new Book("Гомер", 198, 2000);
        Book book4 = new Book("Царь Эдип", 602, 2010);
        Book book5 = new Book("Антигона", 357, 2020);
        Book book6 = new Book("Трагедии", 312, 1980);
        Book book7 = new Book("Драмы", 698, 1990);
        Book book8 = new Book("Эврипид", 417, 2000);
        Book book9 = new Book("Софокл", 98, 2010);
        Book book10 = new Book("Лисистрата", 357, 2020);
        Book book11 = new Book("Книга комедий", 67, 1980);
        Book book12 = new Book("Аристофан и его время", 935, 1990);
        Book book13 = new Book("Еврипид", 276, 2000);
        Book book14 = new Book("Прикованный Прометей", 502, 2010);
        Book book15 = new Book("Эсхил", 826, 2020);
        Book book16 = new Book("Апология Сократа", 168, 1980);
        Book book17 = new Book("Горгий", 302, 1990);
        Book book18 = new Book("Федон", 87, 2000);
        Book book19 = new Book("Теэтет", 450, 2010);
        Book book20 = new Book("Парменид", 182, 2020);
        Book book21 = new Book("Сердце Сапфо", 333, 1980);
        Book book22 = new Book("Остров Лесбос", 614, 1990);
        Book book23 = new Book("Поэтика", 108, 2000);
        Book book24 = new Book("Греко-персидские войны", 892, 2010);
        Book book25 = new Book("Левкиппа и Клитофонт", 259, 2020);

        List<Book> bookSet1 = new ArrayList<>();
        List<Book> bookSet2 = new ArrayList<>();
        List<Book> bookSet3 = new ArrayList<>();
        List<Book> bookSet4 = new ArrayList<>();
        List<Book> bookSet5 = new ArrayList<>();

        bookSet1.addAll(List.of(book1, book2, book3, book4, book5));
        bookSet2.addAll(List.of(book6, book7, book8, book9, book10));
        bookSet3.addAll(List.of(book11, book12, book13, book14, book15));
        bookSet4.addAll(List.of(book16, book17, book18, book19, book20));
        bookSet5.addAll(List.of(book21, book22, book23, book24, book25));

        Student student1 = new Student("Alex Smiht", bookSet1);
        Student student2 = new Student("Bob Marley", bookSet2);
        Student student3 = new Student("Helen B.", bookSet3);
        Student student4 = new Student("Sarah Connor", bookSet4);
        Student student5 = new Student("Homer Simpson", bookSet5);

        students.addAll(List.of(student1,student2,student3,student4,student5));

        return students;
    }
}
