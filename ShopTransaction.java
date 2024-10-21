import java.util.Scanner;

public class ShopTransaction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter item 1 name, price, quantity:");
        String item1 = scanner.next();
        double price1 = scanner.nextDouble();
        int quantity1 = scanner.nextInt();

        System.out.println("Enter item 2 name, price, quantity:");
        String item2 = scanner.next();
        double price2 = scanner.nextDouble();
        int quantity2 = scanner.nextInt();

        System.out.println("Enter discount percentage:");
        double discount = scanner.nextDouble() / 100;

        double totalCost1 = price1 * quantity1;
        double totalCost2 = price2 * quantity2;
        double totalCost = totalCost1 + totalCost2;
        double discountAmount = totalCost * discount;
        double totalCostAfterDiscount = totalCost - discountAmount;

        System.out.println("Total cost for " + item1 + ": " + totalCost1);
        System.out.println("Total cost for " + item2 + ": " + totalCost2);
        System.out.println("Total cost after discount: " + totalCostAfterDiscount);

        scanner.close();
    }
}
