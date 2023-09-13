package flipkart;

import java.util.ArrayList;
import java.util.List;

import static com.jsp.staticScannerAndPrint.StaticScannerAndPrint.*;

public class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public void removeItem(Product product) {
        items.remove(product);
    }

    public void viewCart() {
        println("===== View Shopping Cart =====");
        if (items.isEmpty()) {
            println("Your shopping cart is empty.");
        } else {
            for (Product product : items) {
                println("Product: " + product.getName());
                println("Description: " + product.getDescription());
                println("Price: $" + product.getPrice());
                println();
            }
        }
    }

    public boolean containsItem(Product product) {
        return items.contains(product);
    }
}
