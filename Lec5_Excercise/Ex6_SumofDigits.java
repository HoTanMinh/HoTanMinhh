package Lec5_Excercise;
import java.util.Scanner;
public class Ex6_SumofDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        int sum = 0, temp = number;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("The sum of digits of " + temp + " is: " + sum);
    }
}