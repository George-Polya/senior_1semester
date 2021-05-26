package problem3_strategy;

public class GroupAdvisor implements Advisor {
    public static GroupAdvisor singleton = new GroupAdvisor();

    public Firework recommend(Customer customer) {
        return (Firework) Rel8.advise(customer);
    }
}
