package Lec6_Arrays_Arrayslist;
import java.util.ArrayList;
import java.util.Scanner;
public class UnlimitedDataEntry {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int input;
        long sum = 0;
        System.out.println("Enter integers (enter -1 to stop):");
        while (true) {
            System.out.print("Enter a number: ");
            input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            numbers.add(input);
            sum += input;
        }
        System.out.println("Numbers entered: " + numbers);
        System.out.println("The sum is: " + sum);
    }
}
