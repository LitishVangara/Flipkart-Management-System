package flipkart;

import java.util.Scanner;

import static com.jsp.staticScannerAndPrint.StaticScannerAndPrint.*;

class RegisterUser {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String address;

    public boolean registerUser(Scanner scan) {
        println("                       Registration Form");
        println("                       ________________");
        println("Enter the First name");
        firstName = scan.nextLine();
        println("Enter your last name ");
        lastName = scan.nextLine();

        boolean isValidEmail = false;
        do {
            println("Enter your email ");
            email = scan.nextLine();

            if (email.contains("@") && email.endsWith(".com")) {
                isValidEmail = true;
            } else {
                System.err.println("Error: Invalid email. Please re-enter.");
            }
        } while (!isValidEmail);

        boolean isValidPassword = false;
        do {
            println("Enter your password ");
            String password = scan.nextLine();

            if (password.length() >= 8 && password.length() <= 12) {
                isValidPassword = true;
                println("Password set successfully!");
                println();
                this.password = password;
            } else {
                System.err.println("Error: Password must be 8 to 12 characters long. Please re-enter.");
            }
        } while (!isValidPassword);

       

        println("Confirm your password ");
        String confirmPassword = scan.nextLine();
        println("Enter your address ");
        address = scan.nextLine();

        if (password.equals(confirmPassword)) {
            return true;
        } else {
            System.err.println("Error: Passwords do not match.");
        }
        return false;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
