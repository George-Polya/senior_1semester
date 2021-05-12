package problem4_prototype;

public class LoVolCustomer extends Customer {
    private String type = "low";
    private String name;
    private String company;

    public LoVolCustomer(String name, String company) {
        this.name = name;
        this.company = company;
    }

    @Override
    Customer Customerclone(String name, String company) {
        return new LoVolCustomer(name, company);
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
