package Lec10_Execire.OOP_Nguoi;

import java.util.ArrayList;

public class PersonList {

    private ArrayList<Person> personList = new ArrayList<>();

    public void addPerson(Person person) {
        person.inputInfo();
        personList.add(person);
    }

    public void displayAll() {
        if (personList.isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }
        for (Person p : personList) {
            p.displayInfo();
            System.out.println("----------------------");
        }
    }

    public Person findByIdCard(int idCard) {
        for (Person p : personList) {
            if (p.getIdCard() == idCard) {
                return p;
            }
        }
        return null;
    }

    public boolean updateByIdCard(int idCard) {
        Person p = findByIdCard(idCard);
        if (p != null) {
            System.out.println("Enter new information:");
            p.inputInfo();
            return true;
        }
        return false;
    }

    public boolean deleteByIdCard(int idCard) {
        Person p = findByIdCard(idCard);
        if (p != null) {
            personList.remove(p);
            return true;
        }
        return false;
    }
}
