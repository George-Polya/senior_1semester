package problem4;

import java.util.Date;

public class Person extends Party {
    private String firstName;
    private String lastName;
    private Date dob;
    private String nationality;

    @Override
    public void printName() {
        System.out.println("Name: " + firstName + " " + lastName);
    }

    @Override
    public void printDetails() {
        System.out.println("DOB: " + dob.toString() + ", Nationality: " + nationality);

    }
}
