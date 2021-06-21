package problem3_factory;

public class LGMotor extends Motor{
    private String name = "LG";
    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("move LG Motor " + direction);
    }

    @Override
    protected String getName() {
        return name;
    }
}
