package Lec6_Arrays_Arrayslist;
import java.util.Scanner;
public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a lowercase string: ");
        String text = scanner.nextLine().toLowerCase();
        int[] frequency = new int[26];
        for (char c : text.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                frequency[c - 'a']++;
            }
        }
        System.out.println("Character frequencies:");
        for (int i = 0; i < 26; i++) {
            if (frequency[i] > 0) {
                System.out.println((char)('a' + i) + ": " + frequency[i]);
            }
        }
    }
}