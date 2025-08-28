package Lec6_Arrays_Arrayslist;
import java.util.Arrays;
import java.util.Scanner;
public class MergeTwoSortedArrays {
    public static int[] merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int[] result = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) result[k++] = arr1[i++];
            else result[k++] = arr2[j++];
        }
        while (i < n1) result[k++] = arr1[i++];
        while (j < n2) result[k++] = arr2[j++];
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of first sorted array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < n1; i++) arr1[i] = scanner.nextInt();
        System.out.print("Enter size of second sorted array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < n2; i++) arr2[i] = scanner.nextInt();
        int[] merged = merge(arr1, arr2);
        System.out.println("Merged sorted array: " + Arrays.toString(merged));
    }
}
