package Lec6_Arrays_Arrayslist;
import java.util.ArrayList;
import java.util.Scanner;
public class RemoveDuplicateElements {
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer number : list) {
            if (!newList.contains(number)) {
                newList.add(number);
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        System.out.println("Original list: " + numbers);
        ArrayList<Integer> uniqueList = removeDuplicates(numbers);
        System.out.println("List without duplicates: " + uniqueList);
    }
}