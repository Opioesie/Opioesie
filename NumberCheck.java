import java.util.Scanner;
public class NumberCheck{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        // Ask the user to enetr a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println(number + "is a positive number.");
        }
        else if (number < 0) {
            System.out.println(number + "is a negative number.");
        }
        else {
            System.out.println("The number is zero.");
        }
        scanner.close();
    }
}