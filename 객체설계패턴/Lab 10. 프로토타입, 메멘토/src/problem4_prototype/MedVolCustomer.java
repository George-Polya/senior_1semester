package problem4_prototype;

public class MedVolCustomer extends Customer {
    private String type = "medium";
    private String name;
    private String company;

    public MedVolCustomer(String name, String company) {
        this.name = name;
        this.company = company;
    }

    @Override
    Customer Customerclone(String name, String company) {
        return new MedVolCustomer(name, company);
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCompany() {
        return company;
    }
}
