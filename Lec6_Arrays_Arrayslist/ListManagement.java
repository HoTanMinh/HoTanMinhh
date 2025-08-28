package Lec6_Arrays_Arrayslist;
import java.util.ArrayList;
import java.util.Scanner;
public class ListManagement {
    public static void main(String[] args) {
        ArrayList<String> todoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- TO-DO LIST MENU ---");
            System.out.println("1. Add a new task");
            System.out.println("2. View all tasks");
            System.out.println("3. Remove a task by position");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
           
            while (!scanner.hasNextInt()) { 
                System.out.print("Invalid input. Enter a number (1-4): ");
                scanner.next(); 
            }
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter new task: ");
                    String task = scanner.nextLine();
                    todoList.add(task);
                    System.out.println("Task added successfully.");
                    break;
                case 2:
                    System.out.println("\n--- Task List ---");
                    if (todoList.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        for (int i = 0; i < todoList.size(); i++) {
                            System.out.println((i + 1) + ". " + todoList.get(i));
                        }
                    }
                    break;
                case 3:
                    if (todoList.isEmpty()) {
                        System.out.println("The task list is empty.");
                        break;
                    }
                    System.out.print("Enter the position of the task to remove: ");
                    int index = scanner.nextInt();
                    if (index > 0 && index <= todoList.size()) {
                        todoList.remove(index - 1); // user enters 1-based index
                        System.out.println("Task removed successfully.");
                    } else {
                        System.out.println("Invalid position.");
                    }
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}
