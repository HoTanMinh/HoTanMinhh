package Lec4_Exercise;
import java.util.Scanner;
public class Ex3_LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        boolean isLeapYear = false;
        if ((year % 4 == 0) && (year % 100 != 0)) {
            isLeapYear = true;
        } else if (year % 400 == 0) {
            isLeapYear = true;
        }
        if (isLeapYear) {
            System.out.println(year + "  is a leap year");
        } else {
            System.out.println(year + "  is not a leap year");
        }
    }
}