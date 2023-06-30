package Bookk;

public class MainBook {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books to the library
        Book book1 = new Book("Book 1", "Author 1", 3);
        Book book2 = new Book("Book 2", "Author 2", 2);
        library.addBook(book1);
        library.addBook(book2);
        
        // Display all books in the library
        library.displayBooks();

        // Create members
        Member member1 = new Member("Member 1");
        Member member2 = new Member("Member 2");


        // Member 1 borrows a book
        member1.borrowBook(library, "Book 1");

        // Member 2 tries to borrow an unavailable book
        member2.borrowBook(library, "Book 1");
        member2.borrowBook(library, "Book 1");
        member2.borrowBook(library, "Book 1");

        // Member 1 returns the book
        member1.returnBook(library, "Book 1");
    }
}
