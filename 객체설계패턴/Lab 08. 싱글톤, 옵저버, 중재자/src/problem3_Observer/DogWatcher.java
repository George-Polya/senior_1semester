package problem3_Observer;

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
