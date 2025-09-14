package Lec10_Execire.OOP_Book;

public interface IBook {
    void addBook(Book book);
    boolean updateBookById(String id);
    void displayDetails();
    double calculatePrice();
}

