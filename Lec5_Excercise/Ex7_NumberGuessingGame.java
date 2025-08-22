package Lec5_Excercise;
import java.util.Random;
import java.util.Scanner;
public class Ex7_NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secret = random.nextInt(100) + 1;
        int guess, tries = 0;
        System.out.println("I have chosen a number between 1 and 100. Try to guess it!");
        do {
            System.out.print("Your guess: ");
            guess = scanner.nextInt();
            tries++;
            if (guess > secret) {
                System.out.println("Your number is higher than the secret.");
            } else if (guess < secret) {
                System.out.println("Your number is lower than the secret.");
            } else {
                System.out.println("Congratulations! You guessed correctly after " + tries + " tries.");
            }
        } while (guess != secret);
    }
}
