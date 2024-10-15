import java.util.Scanner;

public class HotelExperience {
    private String customerName;
    private boolean isCheckedIn;
    private String feedback;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     // Constructor
     public HotelExperience(String customerName) {
        this.customerName = customerName;
        this.isCheckedIn = false;
        this.feedback = "";}

     // Method to book a room
     public void bookRoom() {
        System.out.println("Room booked for " + customerName + ". Looking forward to your stay!");
     }

     // Method to check in
     public void checkIn() {
         if (!isCheckedIn) {
             isCheckedIn = true;
             System.out.println(customerName + " has checked in. Welcome to the hotel!");
         } else {
             System.out.println(customerName + " is already checked in.");
         }
     }

     // Method to check out
     public void checkOut() {
         if (isCheckedIn) {
             isCheckedIn = false;
             System.out.println(customerName + " has checked out. We hope you had a pleasant stay!");
         } else {
             System.out.println("You need to check in first before checking out.");
         }
     }

     // Method to leave feedback
     public void leaveFeedback(String feedback) {
         this.feedback = feedback;
        System.out.println("Thank you for your feedback: " + feedback);
      }

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the hotel! What's your name?");
        String customerName = scanner.nextLine();

        HotelExperience hotel = new HotelExperience(customerName);
        int choice;
        
        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Book a Room");
            System.out.println("2. Check In");
            System.out.println("3. Check Out");
            System.out.println("4. Leave Feedback");
            System.out.println("5. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            switch (choice) {
                case 1:
                    hotel.bookRoom();
                    break;
                case 2:
                    hotel.checkIn();
                    break;
                case 3:
                    hotel.checkOut();
                    break;
                case 4:
                    System.out.println("Please leave your feedback:");
                    String feedback = scanner.nextLine();
                    hotel.leaveFeedback(feedback);
                    break;
                case 5:
                    System.out.println("Thank you for visiting! Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
    }
}