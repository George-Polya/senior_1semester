package problem3_strategy;

public class ItemAdvisor implements Advisor {
    public static ItemAdvisor singleton = new ItemAdvisor();

    public Firework recommend(Customer customer) {
        return (Firework) LikeMyStuff.suggest(customer);
    }
}
