package it.training.lesson24.task1;

public class Book {
    String title;

    public Book(String title) {
        this.title = title;
    }

    class Author {
        String name;
        int age;

        public Author(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {

        Book book = new Book("The Great Gatsby");


        Book.Author author = book.new Author("F. Scott Fitzgerald", 44);


        System.out.println("Title of the it.training.lesson24.task1.Book: " + book.title);
        System.out.println("Name of the Author: " + author.name);
    }
}
