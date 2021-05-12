package problem4_prototype;

public abstract class Customer {
    private String type;
    private String name;
    private String company;

    abstract Customer Customerclone(String name, String company);

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }
}
