package problem3_Observer;
// 2016112158
/**
 * 데이터(DogBot)를 보유하는 Publisher
 * java.util.Observable 클래스를 상속받았기 때문에 attach, detach, notify 등의 기능을 보유
 * 동시에 DogBot인터페이스를 구현하여 DogBot의 공통기능을 보유하도록 함
 */

import java.util.Observable;

public class ObservableDogBot extends Observable implements DogBot {


    private DogBot dogbot;

    public ObservableDogBot(DogBot dogbot) {
        this.dogbot = dogbot;
    }

    public DogBot getDogbot() {
        return dogbot;
    }

    public void setDogbot(DogBot dogbot) {
        this.dogbot = dogbot;
    }

    public boolean eat() {
        if (dogbot.eat()) {
            setChanged();
            notifyObservers("eat");
            return true;
        } else {
            return false;
        }
    }

    public void rest() {
        dogbot.rest();
        setChanged();
        notifyObservers("rest");

    }


    public void play() {
        dogbot.play();
        setChanged();
        notifyObservers("play");
    }

    public String noise() {
        return dogbot.noise();
    }


    public String getName() {
        return dogbot.getName();
    }
}
