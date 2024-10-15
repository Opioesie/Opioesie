import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String CORRECT_PASSWORD = "password123"; // Set the correct password here
        final int MAX_ATTEMPTS = 3;
        int attempts = 0;
        boolean isAuthenticated = false;

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Enter your password: ");
            String inputPassword = scanner.nextLine();
            attempts++;

            if (inputPassword.equals(CORRECT_PASSWORD)) {
                isAuthenticated = true;
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
            }
        }

        if (isAuthenticated) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied. You have used all your attempts.");
        }

        scanner.close();
    }
}