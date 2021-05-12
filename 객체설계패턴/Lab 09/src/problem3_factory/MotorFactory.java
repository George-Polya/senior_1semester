package problem3_factory;

public class MotorFactory {
    public Motor createMotor(String type){
        Motor motor = null;
        if(type == "Hyundai"){
            motor = new HyundaiMotor();
        }
        if(type == "LG"){
            motor = new LGMotor();
        }
        return motor;
    }
}
