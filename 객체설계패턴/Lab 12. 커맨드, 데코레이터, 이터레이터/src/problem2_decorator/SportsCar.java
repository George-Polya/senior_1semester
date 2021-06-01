package problem2_decorator;

public class SportsCar extends CarDecorator {
    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        System.out.print("Adding features of Sports Car. ");
    }
}
