package problem3_Observer;
// 2016112158 김희수
/**
 * DogWatcher 클래스는 데이터를 이용하는 subscriber, 즉 Observer이다
 * 따라서 Observer 인터페이스의 update메소드를 구현
 * update메소드는 Observable에서 데이터를 pulling함(가져옴)
 */

import java.util.Observer;
import java.util.Observable;

public class DogWatcher implements Observer {
    private String name;

    public DogWatcher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof DogBot) {
            DogBot dogbot = (DogBot) o;
            System.out.println("** " + name + " observes" + dogbot.getName() + " " + arg);        }
    }


}
