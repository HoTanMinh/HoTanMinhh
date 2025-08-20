package Lec4_Exercise;
import java.util.Scanner;
public class Ex6_AcademicGrading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter average score (10 - point scale): ");
        double score = scanner.nextDouble();
        String grade;
        if (score < 0 || score > 10) {
            grade = "Invalid points";
        } else if (score >= 9.0) {
            grade = "Excellent";
        } else if (score >= 8.0) {
            grade = "Good";
        } else if (score >= 6.5) {
            grade = "Fair";
        } else if (score >= 5.0) {
            grade = "Average";
        } else {
            grade = "Fail";
        }
        System.out.println("Classification of academic performance: " + grade);
    }
}

