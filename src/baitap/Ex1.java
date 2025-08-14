package baitap;
public class Ex1 {
    public static void main(String[] args) {
        // Exercise 1
        System.out.println("Exercise 1:");
        System.out.println("1 + 2 = " + (1 + 2));
        System.out.println("3.5 + 8 = " + (3.5 + 8));
        System.out.println("1 / 2 = " + (1 / 2)); 
        System.out.println("4.5 + 7 = " + (4.5 + 7));
        System.out.println("4 * 5 + 1 = " + (4 * 5 + 1));
        System.out.println("20 % 3 + 2 - 7 = " + (20 % 3 + 2 - 7));

        // Exercise 21
        int x = 1;
        int y = x++ + ++x - x-- - x++ + x - x--;
        System.out.println("\nExercise 21:");
        System.out.println("y = " + y);
        System.out.println("x sau khi tính y = " + x);

        // Exercise 22
        x = 1;
        int z = x-- - x++ + --x - x + x-- + x;
        System.out.println("\nExercise 22:");
        System.out.println("z = " + z);
        System.out.println("x sau khi tính z = " + x);
    }
}
