package problem3_factory;

public class FactoryMain {
    public static void main(String[] args){
        MotorFactory factory = new MotorFactory();
        Motor motor = factory.createMotor("LG");
        ElevatorController controller1 = new ElevatorController(1,motor);
        controller1.gotoFloor(5);
        controller1.gotoFloor(3);

        motor = factory.createMotor("Hyundai");
        ElevatorController controller2 = new ElevatorController(1,motor);
        controller2.gotoFloor(4);
        controller2.gotoFloor(6);
    }
}
