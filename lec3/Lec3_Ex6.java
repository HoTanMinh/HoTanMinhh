package Lec3_Scanner;
import java.util.Scanner;
public class Lec3_Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();       
        System.out.println("Hello, " + fullName);
    }
}
