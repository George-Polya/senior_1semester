package problem4_prototype;

public class HivolCustomer extends Customer {
    private String type = "high";
    private String name;
    private String company;

    public HivolCustomer(String name, String company) {
        this.name = name;
        this.company = company;
    }

    @Override
    Customer Customerclone(String name, String company) {
        return new HivolCustomer(name, company);
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
