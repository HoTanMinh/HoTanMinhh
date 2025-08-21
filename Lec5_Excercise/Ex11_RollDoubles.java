package Lec5_Excercise;
import java.util.Random;
public class Ex11_RollDoubles {
    public static void main(String[] args) {
        Random random = new Random();
        int dice1, dice2, count = 0;

        do {
            dice1 = random.nextInt(6) + 1;
            dice2 = random.nextInt(6) + 1;
            count++;
            System.out.println("Roll " + count + ": " + dice1 + " and " + dice2);
        } while (dice1 != dice2);

        System.out.println("You rolled doubles after " + count + " tries!");
    }
}
