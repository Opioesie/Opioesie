import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length and width of rectangle:");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double areaRectangle = length * width;
        System.out.println("Area of Rectangle: " + areaRectangle);

        System.out.println("Enter base and height of triangle:");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        double areaTriangle = 0.5 * base * height;
        System.out.println("Area of Triangle: " + areaTriangle);

        scanner.close();
    }
}
