package Lec4_Exercise;
import java.util.Scanner;
public class Ex8_QuadrantDetermination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x coordinate: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y coordinate: ");
        double y = scanner.nextDouble();
        if (x > 0 && y > 0) {
            System.out.println("The point lies in the 1st quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("The point lies in the 2nd quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("The point lies in the 3rd quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("The point lies in the 4th quadrant");
        } else {
            System.out.println("The point lies on an axis");
        }
    }
}
