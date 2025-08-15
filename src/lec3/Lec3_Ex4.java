package Lec3_Scanner;
import java.util.Scanner;
public class Lec3_Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        System.out.print("Enter the first floating-point number: ");
        double firstNumber = scanner.nextDouble();       
        System.out.print("Enter the second floating-point number: ");
        double secondNumber = scanner.nextDouble();       
        double average = (firstNumber + secondNumber) / 2;
        System.out.println("The average is: " + average);
    }
}
