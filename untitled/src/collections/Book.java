package collections;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String name;
    private int pages;
    private int year;

    public Book(String name, int pages, int year) {
        this.name = name;
        this.pages = pages;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Book book) {
        return Integer.compare(this.pages, book.pages);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return pages == book.pages && year == book.year && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pages, year);
    }

    @Override
    public String toString() {
        return String.format("Book %s %d pages %d year",name, pages, year);
    }
}
