package Lec10_Execire.OOP_Book;

public class TextBook extends Book {

    private String subject;

    public TextBook(String id, String title, double basePrice, String subject) {
        super(id, title, basePrice);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double calculatePrice() {
        return getBasePrice() * 1.1; // +10%
    }

    public void displayDetails() {
        System.out.println("TextBook [ID: " + getId()
                + ", Title: " + getTitle()
                + ", Subject: " + subject
                + ", Price: " + calculatePrice() + "]");
    }
}
