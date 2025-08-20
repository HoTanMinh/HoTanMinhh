package Lec4_Exercise;
import java.util.Scanner;
public class Ex9_AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        double absoluteValue = (number >= 0) ? number : -number;
        System.out.println("The absolute value of " + number + " is " + absoluteValue);
    }
}
