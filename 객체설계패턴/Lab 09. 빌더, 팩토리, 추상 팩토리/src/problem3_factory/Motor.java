package problem3_factory;

enum Direction {UP,DOWN}
enum MotorStatus {MOVING,STOPPING}
public abstract class Motor {
    private MotorStatus motorStatus;
    public Motor(){
        motorStatus = MotorStatus.STOPPING;
    }

    protected abstract void moveMotor(Direction direction);
    protected abstract String getName();


    public MotorStatus getMotorStatus(){
        return motorStatus;
    }

    public void setMotorStatus(MotorStatus motorStatus){
        this.motorStatus = motorStatus;
    }

    public void move(Direction direction){
        MotorStatus motorStatus = getMotorStatus();
        if(motorStatus == MotorStatus.MOVING)
            return;
        moveMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }

    public void stop(){
        motorStatus = MotorStatus.STOPPING;
        System.out.println("stop Elevator");
    }
}
