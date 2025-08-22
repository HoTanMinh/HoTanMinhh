package Lec5_Excercise;
import java.util.Scanner;
public class Ex9_AverageUntil0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, count = 0;
        double sum = 0;
        System.out.println("Enter numbers (0 to stop):");
        while ((number = scanner.nextInt()) != 0) {
            sum += number;
            count++;
        }
        if (count > 0) {
            System.out.println("The average is: " + (sum / count));
        } else {
            System.out.println("No numbers entered.");
        }
    }
}