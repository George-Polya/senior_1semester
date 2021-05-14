package problem4_prototype;

public class LoVolCustomer extends Customer {
    private String type = "low";
    private String name;
    private String company;

    public LoVolCustomer(String name, String company) {
        super(name, company);
    }

    @Override
    Customer customerclone(String name, String company) {
        return new LoVolCustomer(name, company);
    }

}
