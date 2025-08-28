package Lec6_Arrays_Arrayslist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ConvertBetween {
    public static ArrayList<String> arrayToArrayList(String[] arr) {
        ArrayList<String> list = new ArrayList<>();
        for (String item : arr) list.add(item);
        return list;
    }
    public static String[] arrayListToArray(ArrayList<String> list) {
        return list.toArray(new String[0]);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements in String array: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] arr = new String[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) arr[i] = scanner.nextLine();
        ArrayList<String> list = arrayToArrayList(arr);
        System.out.println("Converted ArrayList: " + list);
        System.out.print("Enter number of elements in ArrayList: ");
        int m = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> list2 = new ArrayList<>();
        System.out.println("Enter elements of ArrayList:");
        for (int i = 0; i < m; i++) list2.add(scanner.nextLine());
        String[] newArr = arrayListToArray(list2);
        System.out.println("Converted Array: " + Arrays.toString(newArr));
    }
}