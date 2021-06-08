package problem4;

import java.util.Date;

public class Company extends Party{
    private String name;
    private String companyType;
    private Date incorporated;


    @Override
    public void printName() {
        System.out.println("Name: " + name + " " + companyType);
    }

        @Override
    public void printDetails() {
            System.out.println("Incorporated: " + incorporated.toString());
    }
}
