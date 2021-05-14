package problem4_prototype;

public class HivolCustomer extends Customer {
    private String type = "high";
    private String name;
    private String company;

    public HivolCustomer(String name, String company) {
        super(name, company);
    }

    @Override
    Customer customerclone(String name, String company) {
        return new HivolCustomer(name, company);
    }

}
