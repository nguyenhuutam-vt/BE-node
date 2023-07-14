package ManagerLibrary;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private List<Book> borrow;

    public Member(String name) {
        this.name = name;
        borrow = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrow() {
        return borrow;
    }

    public void borrowBook(Book book, Library library) {
        if (library.getAllBooks().contains(book) && book.getQuantity() > 0) {
            borrow.add(book);
            book.setQuantity(book.getQuantity() - 1);
            System.out.println(name + " borrowed the book: " + book.getTitle());
        } else {
            System.out.println("The book is not available for borrowing.");
        }
    }

    public void returnBook(Book book, Library library) {
        if (borrow.contains(book)) {
            borrow.remove(book);
            book.setQuantity(book.getQuantity() + 1);
            System.out.println(name + " returned the book: " + book.getTitle());
        } else {
            System.out.println("You did not borrow this book.");
        }
    }
}
