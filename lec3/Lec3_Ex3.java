package Lec3_Scanner;
import java.util.Scanner;
public class Lec3_Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();       
        System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt();        
        int sum = firstNumber + secondNumber;
        System.out.println("The sum is: " + sum);
    }
}
