import java.util.Scanner;

public class CentigradeToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in Centigrade:");
        double centigrade = scanner.nextDouble();
        double fahrenheit = 32 + (9.0 * centigrade / 5);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        scanner.close();
    }
}
