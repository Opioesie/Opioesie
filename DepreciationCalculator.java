import java.util.Scanner;

public class DepreciationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter cost value:");
        double costValue = scanner.nextDouble();

        System.out.println("Enter scrap value:");
        double scrapValue = scanner.nextDouble();

        System.out.println("Enter estimated number of years of useful life:");
        int usefulLife = scanner.nextInt();

        System.out.println("Enter number of years used so far:");
        int yearsUsed = scanner.nextInt();

        double depreciationPerAnnum = (costValue - scrapValue) / usefulLife;
        double accumulatedValue = depreciationPerAnnum * yearsUsed;
        double netBookValue = costValue - accumulatedValue;

        System.out.println("Depreciation per annum: " + depreciationPerAnnum);
        System.out.println("Accumulated value: " + accumulatedValue);
        System.out.println("Net book value: " + netBookValue);

        scanner.close();
    }
}
