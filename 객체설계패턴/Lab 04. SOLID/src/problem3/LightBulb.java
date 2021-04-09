package problem3;

public class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb turn off");
    }
}
