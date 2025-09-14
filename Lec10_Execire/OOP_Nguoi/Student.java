package Lec10_Execire.OOP_Nguoi;

import java.util.Scanner;

public class Student extends Person {

    private String studentId;
    private String conduct;

    public Student() {
    }

    public Student(String fullName, java.util.Date birthDate, String gender, int idCard,
            String studentId, String conduct) {
        super(fullName, birthDate, gender, idCard);
        this.studentId = studentId;
        this.conduct = conduct;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getConduct() {
        return conduct;
    }

    public void setConduct(String conduct) {
        this.conduct = conduct;
    }

    public void evaluateConduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Evaluate conduct: 1-Excellent, 2-Good, 3-Average, 4-Poor");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                conduct = "Excellent";
                break;
            case 2:
                conduct = "Fair";
                break;
            case 3:
                conduct = "Average";
                break;
            case 4:
                conduct = "Weak";
                break;
            default:
                conduct = "Undefined";
        }
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        studentId = sc.nextLine();
        evaluateConduct();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId + ", Conduct: " + conduct);
    }
}
