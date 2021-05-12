package problem3_factory;

public class HyundaiMotor extends Motor {
    private String name = "Hyundai";
    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("move Hyndai Motor " + direction);
    }

    @Override
    protected String getName() {
        return name;
    }
}
