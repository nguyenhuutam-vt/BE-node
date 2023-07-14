package ManagerLibrary;

public class Main {
    public static void main(String[] args) {
        Library lb = new Library();

        Book b1 = new Book("Dac Nhan Tam", "Dale Carnegie", 10);
        Book b2 = new Book("Nha Gia Kim", "Paulo Coelho", 6);
        lb.addBook(b1);
        lb.addBook(b2);

        Member m1 = new Member("Bill");
        m1.borrowBook(b1, lb);
        m1.borrowBook(b2, lb);
        m1.returnBook(b1, lb);

        Member m2 = new Member("Billion");
        m2.borrowBook(b2, lb);
    }
}
