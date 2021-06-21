package problem4_prototype;

public class MedVolCustomer extends Customer {
    private String type = "medium";
    private String name;
    private String company;

    public MedVolCustomer(String name, String company) {
        super(name, company);
    }

    @Override
    Customer customerclone(String name, String company) {
        return new MedVolCustomer(name, company);
    }


}
