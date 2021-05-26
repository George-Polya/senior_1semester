package problem3_strategy;

public class Firework {
    private String name;
    private double mass;
    private Dollars price;
    public Firework() {
    }
    public Firework(String name, double mass, Dollars price) {
        setName(name);
        setMass(mass);
        setPrice(price);
    }

    public static Firework lookup(String name) {
        return new Firework(name, 9.0, new Dollars(3));
    }

    public static Firework getRandom() {
        return new Firework("Random firework", 10.0, new Dollars(15));
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        name = value;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double value) {
        mass = value;
    }

    public Dollars getPrice() {
        return price;
    }

    public void setPrice(Dollars value) {
        price = value;
    }

    public String toString() {
        return getName();
    }
}