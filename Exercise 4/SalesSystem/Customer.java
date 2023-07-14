package SalesSystem;

public class Customer {
    private String name;
    private Order order;

    public Customer(String name) {
        this.name = name;
        order = new Order();
    }

    public void addToCart(Product product) {
        order.addProduct(product);
    }

    public void removeFromCart(Product product) {
        order.removeProduct(product);
    }

    public void getName(){
        System.out.println("Customer Name: " + name );
    }

    public void checkout() {
        order.printInvoice();
    }
}
