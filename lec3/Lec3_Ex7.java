package Lec3_Scanner;
import java.util.Scanner;
public class Lec3_Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("You entered: " + sentence);
    }
}
