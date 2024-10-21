import java.util.Scanner;

public class ComputeAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = scanner.nextLine();

        System.out.println("Enter year of birth:");
        int yearOfBirth = scanner.nextInt();

        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        int age = currentYear - yearOfBirth;

        System.out.println(name + " is " + age + " years old.");
        scanner.close();
    }
}
