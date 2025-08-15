package Lec3_Scanner;
import java.util.Scanner;
public class Lec3_Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter three words: ");        
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();       
        System.out.println("First word: " + word1);
        System.out.println("Second word: " + word2);
        System.out.println("Third word: " + word3);
    }
}
