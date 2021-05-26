package problem3_strategy;

import java.util.Calendar;
import java.util.Date;

public class Customer {
    public static final int BIG_SPENDER_DOLLARS = 1000;

    private static PromotionAdvisor promotionAdvisor = PromotionAdvisor.singleton;
    private static GroupAdvisor groupAdvisor = GroupAdvisor.singleton;
    private static ItemAdvisor itemAdvisor = ItemAdvisor.singleton;
    private static RandomAdvisor randomAdvisor = RandomAdvisor.singleton;
    private Advisor advisor;

    public static void main(String[] args) {

        Firework recommendation = new Customer().getRecommended();
        System.out.println("Customer recommendation: " + recommendation.toString());
    }

    public boolean isRegistered() {
        return false;
    }

    public Firework getRecommended() {
        Firework recommend = getAdvisor().recommend(this);
        return recommend;
    }

    private Advisor getAdvisor() {
        if(advisor == null) {
            if(promotionAdvisor.hasItem())
                advisor = promotionAdvisor;
            else if(isRegistered())
                advisor = groupAdvisor;
            else if(isBigSpender())
                advisor = itemAdvisor;
            else
                advisor = randomAdvisor;
        }
        return advisor;
    }

    public double spendingSince(Date date) {
        return 1000;
    }

    private boolean isBigSpender() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -1);
        return (spendingSince(cal.getTime()) > BIG_SPENDER_DOLLARS);

    }
}
