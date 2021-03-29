package problem10;

public class Automobile {
    Driveable dr;
    public Automobile(Driveable dr) {
        this.dr = dr;
    }

    public void accelerate() {
        dr.accelerate();
    }

    public void steerRight() {
        dr.steerRight();
    }

    public void steerLeft() {
        dr.steerLeft();
    }

    public void steerStraight() {
        dr.steerStraight();
    }

    public void brake() {
        dr.brake();
    }
}
