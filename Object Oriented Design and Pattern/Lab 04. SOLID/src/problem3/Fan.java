package problem3;

public class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan turn off");
    }
}
