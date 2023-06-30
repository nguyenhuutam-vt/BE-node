package Bookk;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private List<Book> borrowedBooks;

    public Member(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }


    public void borrowBook(Library library, String title) {
        Book book = library.findBook(title);
        if (book != null && book.getQuantity() > 0) {
            borrowedBooks.add(book);
            book.quantity--;
            System.out.println(name + " borrowed '" + book.getTitle() + "' successfully.");
        } else {
            System.out.println("The book is not available for borrowing.");
        }
    }

    public void returnBook(Library library, String title) {
        for (Book book : borrowedBooks) {
            if (book.getTitle().equals(title)) {
                borrowedBooks.remove(book);
                book.quantity++;
                System.out.println(name + " returned '" + book.getTitle() + "' successfully.");
                return;
            }
        }
        System.out.println("You have not borrowed this book.");
    }
}
