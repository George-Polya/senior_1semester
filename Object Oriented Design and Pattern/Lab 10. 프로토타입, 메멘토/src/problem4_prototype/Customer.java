package problem4_prototype;

/**
 * 2016112158 김희수
 * Customer 추상클래스
 * 이 클래스를 상속받는 base class들은 customerclone메소드를 구현해야한다
 */
public abstract class Customer {
    private String type;
    private String name;
    private String company;

    public Customer(String name, String company) {
        this.name = name;
        this.company = company;
    }

    abstract Customer customerclone(String name, String company);

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
