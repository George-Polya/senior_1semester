package problem4_prototype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class OfficeProcess {
    private static String QUIT = "-quit";
    Scanner sc = new Scanner(System.in);
    private String name;
    private String type;
    private HashMap customerProtoList = new HashMap<>();
    private List<Customer> customerDB = new ArrayList<>();

    public void register(String type, Customer proto) {
        customerProtoList.put(type, proto);
    }

    public void setName() {
        System.out.println("Enter Company Name");
        String name = sc.nextLine();
        this.name = name;
        System.out.println("Now application would collect lots more company information...");
    }

    public void setType() {
        System.out.println("Please pick a type of customer from one of the following : ('medium' will be assumed otherwise)");
        System.out.println(customerProtoList.keySet());
        String type = sc.nextLine();
        this.type = type;
        System.out.println();
    }


    public Customer create(String type, String name) {
        return ((Customer) customerProtoList.get(type)).customerclone(name, this.name);
    }

    public void setCustomer() {
        System.out.println("Client does some work...\n");
        System.out.println("Enter Customer names or '" + QUIT +"'");
        String customerName;
        while (true) {
            customerName = sc.nextLine();
            if (customerName.equals(QUIT)) {
                System.out.println("The customers entered during this session : ");
                for (Customer customer : customerDB) {
                    System.out.println("Customer " + customer.getName() + ", an employee of "
                                        + customer.getCompany() + ".. Spending category : "
                                        + customer.getType() + " volume. Lots more...");
                }
                System.out.println("Client does more work...");
                break;
            }else{
                System.out.println("...more interaction to get information about " + customerName + " ... : Stored in database");
                Customer result = this.create(type, customerName);
                customerDB.add(result);


            }
        }
    }
}
