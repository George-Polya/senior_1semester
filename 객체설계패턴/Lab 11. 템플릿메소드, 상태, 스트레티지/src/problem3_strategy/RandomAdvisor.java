package problem3_strategy;

public class RandomAdvisor implements Advisor {
    public static RandomAdvisor singleton = new RandomAdvisor();

    @Override
    public Firework recommend(Customer customer) {
        return Firework.getRandom();
    }
}
