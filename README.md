import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HotelRoomService {
    private static final double[] ITEM_PRICES = {10.0, 5.0, 7.0}; // Prices for items
    private static final String[] MENU_ITEMS = {"Pizza", "Burger", "Soda"};
    private static Map<String, Double> roomOrders = new HashMap<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Hotel Room Service!");

        // Get room details
        System.out.print("Please enter your room number: ");
        String roomNumber = scanner.nextLine();
        System.out.print("Please enter your room type (e.g., Single, Double, Suite): ");
        String roomType = scanner.nextLine();

        System.out.println("You are in room " + roomNumber + " which is a " + roomType + " room.");
        System.out.println("Please choose an item from the menu:");
        for (int i = 0; i < MENU_ITEMS.length; i++) {
            System.out.println((i + 1) + ". " + MENU_ITEMS[i] + " - $" + ITEM_PRICES[i]);
        }
        System.out.println("Enter the number of the item you want to order (0 to finish):");

        double totalCost = 0.0;
        while (true) {
            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
            }
            if (choice < 1 || choice > MENU_ITEMS.length) {
                System.out.println("Invalid choice. Please select a valid item number.");
                continue;
            }

            double itemCost = ITEM_PRICES[choice - 1];
            totalCost += itemCost;
            System.out.println("Added " + MENU_ITEMS[choice - 1] + " to your order. Price: $" + itemCost);
        }

        System.out.println("Your total cost is: $" + totalCost);

        // Record the order
        recordOrder(roomNumber, totalCost);

        scanner.close();
    }

    private static void recordOrder(String roomNumber, double totalCost) {
        roomOrders.put(roomNumber, roomOrders.getOrDefault(roomNumber, 0.0) + totalCost);
        System.out.println("Order recorded for room " + roomNumber + ". Total cost so far: $" + roomOrders.get(roomNumber));
    }

    // Optional: Method to display orders (for testing purposes)
    public static void displayAllOrders() {
        System.out.println("All room orders:");
        for (Map.Entry<String, Double> entry : roomOrders.entrySet()) {
            System.out.println("Room " + entry.getKey() + ": $" + entry.getValue());
        }
    }
}
