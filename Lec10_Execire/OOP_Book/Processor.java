package Lec10_Execire.OOP_Book;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList bl = new BookList();
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add new TextBook");
            System.out.println("2. Add new ReferenceBook");
            System.out.println("3. Update book by ID");
            System.out.println("4. Delete book by ID");
            System.out.println("5. Find book by ID");
            System.out.println("6. Display all books");
            System.out.println("7. Find the most expensive book");
            System.out.println("8. Count books");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String tid = sc.nextLine();
                    System.out.print("Enter Title: ");
                    String ttitle = sc.nextLine();
                    System.out.print("Enter Base Price: ");
                    double tprice = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter Subject: ");
                    String subject = sc.nextLine();
                    bl.addBook(new TextBook(tid, ttitle, tprice, subject));
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    String rid = sc.nextLine();
                    System.out.print("Enter Title: ");
                    String rtitle = sc.nextLine();
                    System.out.print("Enter Base Price: ");
                    double rprice = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter Publisher: ");
                    String publisher = sc.nextLine();
                    bl.addBook(new ReferenceBook(rid, rtitle, rprice, publisher));
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    String uid = sc.nextLine();
                    if (bl.updateBookById(uid)) {
                        System.out.println("Update successful!");
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    String did = sc.nextLine();
                    if (bl.deleteBookById(did)) {
                        System.out.println("Delete successful!");
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter ID to find: ");
                    String fid = sc.nextLine();
                    Book fb = bl.findBookById(fid);
                    if (fb != null) {
                        fb.displayDetails();
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;

                case 6:
                    bl.displayAllBooks();
                    break;

                case 7:
                    Book max = bl.findMostExpensiveBook();
                    if (max != null) {
                        System.out.println("Most expensive book:");
                        max.displayDetails();
                    } else {
                        System.out.println("No books available.");
                    }
                    break;

                case 8:
                    bl.countBooks();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }
}
