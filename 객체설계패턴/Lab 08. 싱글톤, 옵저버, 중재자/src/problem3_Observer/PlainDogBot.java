package problem3_Observer;
// 201611258

/**
 * 기존의 DogBot 클래스의 기능을 그대로 구현한 클래스
 *
 */

public class PlainDogBot implements DogBot {
    protected int hungry;
    protected int tired;
    private String name;

    public PlainDogBot(int hungry, int tired, String name) {
        this.hungry = hungry;
        this.tired = tired;
        this.name = name;
    }

    @Override
    public boolean eat() {
        if (hungry > 6) {
            hungry -= 3;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void rest() {
        hungry ++;
        tired -= 2;
    }

    @Override
    public void play() {
        hungry += 2;
        tired += 3;
    }

    @Override
    public String noise() {
        if (hungry > 8 && tired < 11) {
            return "whine ";
        } else if (tired > 7 && tired > hungry) {
            return "snore ";
        } else {
            return "woof ";
        }
    }
}
