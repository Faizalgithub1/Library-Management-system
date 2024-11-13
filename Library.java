package LibraryManagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(String title, String author, String isbn) {
        books.add(new Book(title, author, isbn));
        System.out.println("Book added!");
    }

    public void displayBooks() {
        if (books.isEmpty()) System.out.println("No books in library.");
        else books.forEach(System.out::println);
    }

    public void searchByTitle(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                System.out.println("Found: " + book);
                return;
            }
        }
        System.out.println("No book found with title: " + title);
    }

    public void removeByIsbn(String isbn) {
        books.removeIf(book -> book.isbn.equals(isbn));
        System.out.println("Book removed (if it existed).");
    }
}