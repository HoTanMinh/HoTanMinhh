package Lec5_Excercise;
import java.util.Scanner;
public class Ex1_Sumfrom1toN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer N: ");
        int n = scanner.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);
    }
}
