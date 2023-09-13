package flipkart;

import java.util.Scanner;

import static com.jsp.staticScannerAndPrint.StaticScannerAndPrint.*;

class LoginUser {
    public void loginUser(Scanner scan, String registeredEmail, String registeredPassword) {
        println("                       Login Form");
        println("                       __________");

        boolean isValid = false;
        do {
            println("Enter Email address");
            String email = scan.nextLine();
            println("Enter password");
            String password = scan.nextLine();

            if (email.equals(registeredEmail) && password.equals(registeredPassword)) {
                isValid = true;
                println("Login successfully completed. Click enter to continue");
            } else {
                System.err.println("Error: Invalid email or password. Please re-enter.");
            }
        } while (!isValid);
    }
}