package SalesSystem;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products;
    private double total;

    public Order() {
        products = new ArrayList<>();
        total = 0.0;
    }

    public void addProduct(Product product) {
        products.add(product);
        total += product.getPrice();
    }

    public void removeProduct(Product product) {
        products.remove(product);
        total -= product.getPrice();
    }

    public double getTotal() {
        return total;
    }

    public void printInvoice() {
        for (Product product : products) {
            System.out.println("- " + product.getName() + ": " + product.getPrice()+ " VND");
        }
        System.out.println("Total: " + getTotal()+ " VND");
    }
}
