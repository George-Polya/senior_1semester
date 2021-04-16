package problem3_Observer;

// 2016112158 김희수

/**
 *DogBot의 공통적인 기능을 선언한 인터페이스
 */
public interface DogBot {
    public boolean eat();

    public void rest();

    public void play();

    public String noise();

    public String getName();
}
