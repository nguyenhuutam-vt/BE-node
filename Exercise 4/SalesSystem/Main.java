package SalesSystem;

public class Main {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("TV", 1000);
        Product product2 = new Product("Phone", 500);
        Product product3 = new Product("Laptop", 2000);

        // Create customer
        Customer customer = new Customer("Bilion");
        customer.getName();
        // Add products to the cart
        customer.addToCart(product1);
        customer.addToCart(product2);
        customer.addToCart(product3);
        customer.checkout();
        customer.removeFromCart(product2);
        customer.checkout();
    }
}
