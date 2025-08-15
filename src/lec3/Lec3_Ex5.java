package Lec3_Scanner;
import java.util.Scanner;
public class Lec3_Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter a boolean (true/false): ");
        boolean value = scanner.nextBoolean();
        if (value) {
            System.out.println("You entered true.");
        } else {
            System.out.println("You entered false.");
        }
    }
}
