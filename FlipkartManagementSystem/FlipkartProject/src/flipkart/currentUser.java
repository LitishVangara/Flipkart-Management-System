package flipkart;

import java.util.ArrayList;
import java.util.Scanner;

import static com.jsp.staticScannerAndPrint.StaticScannerAndPrint.*;

public class currentUser 
{
    private static Scanner scan = new Scanner(System.in);
    private static ShoppingCart shoppingCart = new ShoppingCart();

    private static String address;
    private static String firstName;
    private static String lastName;

    public static void setAddress(String registeredAddress) {
        address = registeredAddress;
    }

    public static void setFirstName(String registeredFirstName) {
        firstName = registeredFirstName;
    }

    public static void setLastName(String registeredLastName) {
        lastName = registeredLastName;
    }

    public static void viewProfile() 
    {
        println("===== View Profile =====");
        println("First Name: " + firstName);
        println("Last Name: " + lastName);
        println("Address: " + address);
    }
    
    public static void searchProducts(String keyword, ArrayList<Product> productList) {
        println("===== Search Results =====");

        // Search for products matching the keyword
        ArrayList<Product> searchResults = new ArrayList<>();

        for (Product product : productList) 
        {
            if (product.getName().toLowerCase().contains(keyword.toLowerCase()) ||
                    product.getDescription().toLowerCase().contains(keyword.toLowerCase())) {
                searchResults.add(product);
            }
        }

        // Display search results
        if (searchResults.isEmpty()) {
            println("No products found matching the search keyword: " + keyword);
        } else {
            for (Product product : searchResults) {
                println("Product: " + product.getName());
                println("Description: " + product.getDescription());
                println("Price: $" + product.getPrice());
                println();
            }
        }
    }

    public static void viewWishlist() 
    {
        println("===== View Wishlist =====");

        // Sample wishlist items
        WishlistItem item1 = new WishlistItem("Product 1", "Description of Product 1", 99.99);
        WishlistItem item2 = new WishlistItem("Product 2", "Description of Product 2", 199.99);
        WishlistItem item3 = new WishlistItem("Product 3", "Description of Product 3", 299.99);

        // Add wishlist items to an array or collection
        ArrayList<WishlistItem> wishlist = new ArrayList<WishlistItem>();

        wishlist.add(item1);
        wishlist.add(item2);
        wishlist.add(item3);

        // Display wishlist items
        for (WishlistItem item : wishlist) {
            println("Item: " + item.getName());
            println("Description: " + item.getDescription());
            println("Price: $" + item.getPrice());
            println();
        }
    }

    public static void viewShoppingCart() 
    {
        shoppingCart.viewCart();
    }

    public static void addToCart1(Product product) {
        // Check if the product is already in the shopping cart
        if (shoppingCart.containsItem(product)) {
            println("Product is already in the shopping cart.");
        } else {
            shoppingCart.addItem(product);
            println("Product added to the shopping cart.");
        }
    }


    public static void browseProducts() 
    {
        ArrayList<Product> productList = new ArrayList<>();
        
        Product laptop = new Product("Lenovo Laptop", "A high-performance laptop with a powerful processor and ample storage capacity.",
                390000, "15.6 inches", 2.3, "1920x1080", "8 MP", "1 TB");
        productList.add(laptop);
        
        Product smartphone = new Product("Samsung Smartphone", "A feature-rich smartphone with a large display and advanced camera capabilities.",
                799, "6.2 inches", 0.3, "2560x1440", "12 MP", "128 GB");
        productList.add(smartphone);
        
        Product headphones = new Product("Sony Headphones", "High-quality headphones with noise cancellation and immersive sound experience.",
                199, "", 0.0, "", "", "");
        productList.add(headphones);

        println("Product 1: " + laptop.getName());
        println("Description: " + laptop.getDescription());
        println("Price: $" + laptop.getPrice());
        println();
        
        println("Product 2: " + smartphone.getName());
        println("Description: " + smartphone.getDescription());
        println("Price: $" + smartphone.getPrice());
        println();
        
        println("Product 3: " + headphones.getName());
        println("Description: " + headphones.getDescription());
        println("Price: $" + headphones.getPrice());
        println();
        
        println("Enter the number of the product you want to add to the shopping cart:");
        int productNumber = scan.nextInt();
        scan.nextLine();

        switch (productNumber) {
            case 1:
                addToCart1(laptop);
                break;
            case 2:
                addToCart1(smartphone);
                break;
            case 3:
                addToCart1(headphones);
                break;
            default:
                System.err.println("Invalid product number. Please try again.");
                break;
        }
    }
}
