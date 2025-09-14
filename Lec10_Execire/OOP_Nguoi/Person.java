package Lec10_Execire.OOP_Nguoi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

    public class Person {

        private String fullName;
        private Date birthDate;
        private String gender;
        private int idCard;

        public Person() {
        }

        public Person(String fullName, Date birthDate, String gender, int idCard) {
            this.fullName = fullName;
            this.birthDate = birthDate;
            this.gender = gender;
            this.idCard = idCard;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public Date getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(Date birthDate) {
            this.birthDate = birthDate;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public int getIdCard() {
            return idCard;
        }

        public void setIdCard(int idCard) {
            this.idCard = idCard;
        }

        public void inputInfo() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter full name: ");
            fullName = sc.nextLine();

            System.out.print("Enter birth date (dd/MM/yyyy): ");
            String bd = sc.nextLine();
            try {
                birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(bd);
            } catch (ParseException e) {
                System.out.println("Invalid date format, using current date.");
                birthDate = new Date();
            }

            System.out.print("Enter gender: ");
            gender = sc.nextLine();

            System.out.print("Enter ID card number: ");
            idCard = Integer.parseInt(sc.nextLine());
        }

        public void displayInfo() {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String bd = (birthDate != null) ? sdf.format(birthDate) : "null";
            System.out.println("Full Name: " + fullName
                    + ", Birth Date: " + bd
                    + ", Gender: " + gender
                    + ", ID Card: " + idCard);
        }
    }

