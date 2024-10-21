import java.util.Scanner;

public class CarRentalCharges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter customer name:");
        String customerName = scanner.next();

        System.out.println("Enter contact phone:");
        String contactPhone = scanner.next();

        System.out.println("Enter number of days car is hired:");
        int daysHired = scanner.nextInt();

        System.out.println("Enter initial mileage:");
        int initialMileage = scanner.nextInt();

        System.out.println("Enter final mileage:");
        int finalMileage = scanner.nextInt();

        int milesCovered = finalMileage - initialMileage;
        int costPerMile = 700;
        int serviceCharges = 4000;
        int costPerDay = 7000;

        int costForMileage = milesCovered * costPerMile;
        int costForDays = daysHired * costPerDay;
        int totalCost = costForMileage + costForDays + serviceCharges;

        System.out.println("Amount payable: " + totalCost);
        System.out.println("Miles moved by the customer: " + milesCovered);

        scanner.close();
    }
}
