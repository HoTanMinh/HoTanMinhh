package Lec4_Exercise;
import java.util.Scanner;
public class Ex10_TriangleClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first side: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the second side: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter the third side: ");
        double side3 = scanner.nextDouble();
        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
            if (side1 == side2 && side2 == side3) {
                System.out.println("This is an equilateral triangle.");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("This is an isosceles triangle.");
            } else {
                System.out.println("This is a scalene triangle.");
            }
        } else {
            System.out.println("These sides cannot form a triangle.");
        }
    }
}
