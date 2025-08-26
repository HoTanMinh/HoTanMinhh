package Lec6_Arrays_Arrayslist;
import java.util.Scanner;
public class WestherAnswer {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.printf("How many day teperatures:");
        int days = console.nextInt();
        int [] temps = new int[days];
        int sum = 0;
        for (int i = 0; i<days; i++){
            System.out.printf("day"+ (i + 1)+ "s high temp: ");
            temps[i] = console.nextInt();
            sum += temps[i];
            
        }
        double average = (double) sum/ days;
        int count = 0;
        for (int i=0; i<days; i++)
        {
            if(temps[i] > average){
                count++;
            }
        }
        System.out.printf("Average temp = %.1f", average);
        System.out.println("");
        System.out.println(count + "days above average");
    }
}