package Lec6_Arrays_Arrayslist;
import java.util.Scanner;
public class CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("The array is empty.");
            scanner.close();
            return;
        }
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Enter the number to count: ");
        int x = scanner.nextInt();
        int count = 0;
        for (int number : numbers) {
            if (number == x) {
                count++;
            }
        }
        System.out.println("The number " + x + " appears " + count + " times in the array.");
    }
}