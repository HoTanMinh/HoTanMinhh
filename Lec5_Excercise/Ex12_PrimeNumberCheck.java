package Lec5_Excercise;
import java.util.Scanner;
public class Ex12_PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number greater than 1: ");
        int n = scanner.nextInt();

        boolean isPrime = n > 1;
        for (int i = 2; i <= Math.sqrt(n) && isPrime; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
        scanner.close();
    }
}
