package Lec6_Arrays_Arrayslist;
import java.util.Scanner;
public class FindtheSecondLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = scanner.nextInt();
        if (n < 2) {
            System.out.println("Array must have at least 2 elements.");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second-largest element is: " + secondLargest);
        }
    }
}
