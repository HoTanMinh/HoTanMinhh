package Lec10_Execire.OOP_Nguoi;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonList pl = new PersonList();
        int cont = 1;

        while (cont == 1) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Enter information (Student / Teacher)");
            System.out.println("2. Display list");
            System.out.println("3. Search person by ID card");
            System.out.println("4. Update person by ID card");
            System.out.println("5. Delete person by ID card");
            System.out.print("Your choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Do you want to enter (1-Student, 2-Teacher): ");
                    int type = Integer.parseInt(sc.nextLine());
                    if (type == 1) {
                        pl.addPerson(new Student());
                    } else if (type == 2) {
                        pl.addPerson(new Teacher());
                    } else {
                        System.out.println("Invalid choice!");
                    }
                    break;

                case 2:
                    pl.displayAll();
                    break;

                case 3:
                    System.out.print("Enter ID card to search: ");
                    int sid = Integer.parseInt(sc.nextLine());
                    Person found = pl.findByIdCard(sid);
                    if (found != null) {
                        System.out.println("Found person:");
                        found.displayInfo();
                    } else {
                        System.out.println("Not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter ID card to update: ");
                    int uid = Integer.parseInt(sc.nextLine());
                    if (pl.updateByIdCard(uid)) {
                        System.out.println("Update successful!");
                    } else {
                        System.out.println("Not found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter ID card to delete: ");
                    int did = Integer.parseInt(sc.nextLine());
                    if (pl.deleteByIdCard(did)) {
                        System.out.println("Delete successful!");
                    } else {
                        System.out.println("Not found!");
                    }
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("Continue? (1-Yes, 0-No): ");
            cont = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Program ended.");
    }
}
