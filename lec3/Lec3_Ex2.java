package Lec3_Scanner;
import java.util.Scanner;
public class Lec3_Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();    
        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
}
