package Lec10_Execire.OOP_Book;

public class ReferenceBook extends Book {

    private String publisher;

    public ReferenceBook(String id, String title, double basePrice, String publisher) {
        super(id, title, basePrice);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double calculatePrice() {
        return getBasePrice() * 1.2; // +20%
    }

    public void displayDetails() {
        System.out.println("ReferenceBook [ID: " + getId()
                + ", Title: " + getTitle()
                + ", Publisher: " + publisher
                + ", Price: " + calculatePrice() + "]");
    }
}
