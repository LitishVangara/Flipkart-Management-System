package flipkart;

import java.util.Scanner;

import static com.jsp.staticScannerAndPrint.StaticScannerAndPrint.*;

class mainClass{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        println("                 WELCOME TO FLIPKART             ");
        println("");

        String registeredEmail = "";
        String registeredPassword = "";
        String registeredAddress = "";
        String registeredFirstName = "";
        String registeredLastName = "";

        RegisterUser register = new RegisterUser();
        boolean success = false;
        while (!success) {
            success = register.registerUser(scan);
            if (!success) {
                System.err.println("Error: Password and confirm password do not match. Please try again.");
            } else {
                registeredEmail = register.getEmail();
                registeredPassword = register.getPassword();
                registeredAddress = register.getAddress();
                registeredFirstName = register.getFirstName();
                registeredLastName = register.getLastName();
                System.out.println("Your registration was successfully completed. Click enter to continue");
                scan.nextLine(); // Wait for user to press enter
            }
        }

        println("");
        println("Press enter to continue to the login form.");
        println(".........................");
        scan.nextLine();

        LoginUser login = new LoginUser();
        login.loginUser(scan, registeredEmail, registeredPassword);

        println("");
        println("☰Flipkart                                                                                                        Grocery             🛒MyCart    ");

        currentUser.setAddress(registeredAddress);
        currentUser.setFirstName(registeredFirstName);
        currentUser.setLastName(registeredLastName);

        boolean exit = false;
        while (!exit) {
            println();
            println("1. View Profile🔻            2. Browse Products🔻               3. View Wishlist🔻              4. View Shopping Cart🔻          5. Logout🔻");
            println("");
            print("Choose an option: ");

            int option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1:
                    currentUser.viewProfile();
                    break;
                case 2:
                    currentUser.browseProducts();
                    break;
                case 3:
                    currentUser.viewWishlist();
                    break;
                case 4:
                    currentUser.viewShoppingCart();
                    break;
                case 5:
                    exit = true;
                    println("                                          \u001B[32mLogout successful\u001B[0m         ");
                    break;
                default:
                    println("Invalid option. Please try again.");
                    break;
            }
        }

        scan.close();
    }
}