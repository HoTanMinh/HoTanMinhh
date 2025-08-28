package Lec6_Arrays_Arrayslist;
import java.util.Arrays;
import java.util.Scanner;
public class ConcatenateTwoArrays {
    public static int[] concatenate(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        for (int i = 0; i < a1.length; i++) {
            result[i] = a1[i];
        }
        for (int i = 0; i < a2.length; i++) {
            result[a1.length + i] = a2[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter elements of first array:");
        for (int i = 0; i < n1; i++) arr1[i] = scanner.nextInt();
        System.out.print("Enter size of second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) arr2[i] = scanner.nextInt();

        int[] combined = concatenate(arr1, arr2);
        System.out.println("Concatenated array: " + Arrays.toString(combined));
    }
}
