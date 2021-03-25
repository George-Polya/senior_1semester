package problem3;

public class ElectricPowerSwitch {
    public Switchable switchable;
    public boolean on;

    public ElectricPowerSwitch(Switchable switchable) {
        this.switchable = switchable;
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }

    public void press() {
        boolean checkOn = isOn();
        if (checkOn) {
            switchable.turnOff();
            this.on = false;
        } else {
            switchable.turnOn();
            this.on = true;
        }
    }
}
