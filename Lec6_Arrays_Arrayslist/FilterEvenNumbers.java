package Lec6_Arrays_Arrayslist;
import java.util.ArrayList;
import java.util.Scanner;
public class FilterEvenNumbers {
    public static ArrayList<Integer> filterEven(int[] numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("The array is empty.");
            return;
        }
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        ArrayList<Integer> evenList = filterEven(numbers);
        System.out.println("Even numbers in the array: " + evenList);
    }
}