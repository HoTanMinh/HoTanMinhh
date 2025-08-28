package Lec6_Arrays_Arrayslist;
import java.util.ArrayList;
import java.util.Scanner;
public class RemoveElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) numbers.add(scanner.nextInt());
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) > 50) {
                numbers.remove(i);
            }
        }
        System.out.println("List after removing elements > 50: " + numbers);
    }
}