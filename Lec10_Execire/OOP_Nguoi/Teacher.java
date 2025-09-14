package Lec10_Execire.OOP_Nguoi;

import java.util.Scanner;

public class Teacher extends Person {

    private String teacherId;
    private String competitionRank;

    public Teacher() {
    }

    public Teacher(String fullName, java.util.Date birthDate, String gender, int idCard,
            String teacherId, String competitionRank) {
        super(fullName, birthDate, gender, idCard);
        this.teacherId = teacherId;
        this.competitionRank = competitionRank;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getCompetitionRank() {
        return competitionRank;
    }

    public void setCompetitionRank(String competitionRank) {
        this.competitionRank = competitionRank;
    }

    public void evaluateCompetition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Competition rank: 1-Type A, 2-Type B, 3-Type C");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                competitionRank = "Type A";
                break;
            case 2:
                competitionRank = "Type B";
                break;
            case 3:
                competitionRank = "Type C";
                break;
            default:
                competitionRank = "Undefined";
        }
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter teacher ID: ");
        teacherId = sc.nextLine();
        evaluateCompetition();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Teacher ID: " + teacherId + ", Competition Rank: " + competitionRank);
    }
}
