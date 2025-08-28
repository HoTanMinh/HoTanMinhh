package Lec6_Arrays_Arrayslist;
import java.util.Arrays;
import java.util.Scanner;
public class SwapTwoElementsinanArray {
    public static void swap(int[] arr, int index1, int index2) {
        if (index1 < 0 || index1 >= arr.length || index2 < 0 || index2 >= arr.length) {
            System.out.println("Invalid index.");
            return;
        }
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter first index to swap: ");
        int i1 = scanner.nextInt();
        System.out.print("Enter second index to swap: ");
        int i2 = scanner.nextInt();
        System.out.println("Original array: " + Arrays.toString(arr));
        swap(arr, i1, i2);
        System.out.println("Array after swap: " + Arrays.toString(arr));
    }
}
