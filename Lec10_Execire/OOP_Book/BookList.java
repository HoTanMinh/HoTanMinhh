package Lec10_Execire.OOP_Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookList {

    private ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        bookList.add(book);
    }

    public boolean updateBookById(String id) {
        Scanner sc = new Scanner(System.in);
        for (Book b : bookList) {
            if (b.getId().equals(id)) {
                System.out.print("Enter new title: ");
                b.setTitle(sc.nextLine());
                System.out.print("Enter new base price: ");
                b.setBasePrice(Double.parseDouble(sc.nextLine()));
                return true;
            }
        }
        return false;
    }

    public boolean deleteBookById(String id) {
        return bookList.removeIf(b -> b.getId().equals(id));
    }

    public Book findBookById(String id) {
        for (Book b : bookList) {
            if (b.getId().equals(id)) {
                return b;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("No books in the list.");
            return;
        }
        for (Book b : bookList) {
            b.displayDetails();
        }
    }

    public Book findMostExpensiveBook() {
        if (bookList.isEmpty()) {
            return null;
        }
        Book max = bookList.get(0);
        for (Book b : bookList) {
            if (b.calculatePrice() > max.calculatePrice()) {
                max = b;
            }
        }
        return max;
    }

    public void countBooks() {
        int textCount = 0, refCount = 0;
        for (Book b : bookList) {
            if (b instanceof TextBook) {
                textCount++;
            } else if (b instanceof ReferenceBook) {
                refCount++;
            }
        }
        System.out.println("Total TextBooks: " + textCount);
        System.out.println("Total ReferenceBooks: " + refCount);
    }
}
