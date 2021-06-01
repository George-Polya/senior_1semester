package problem2_decorator;

public class LuxuryCar extends CarDecorator {
    LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        System.out.print("Adding features of Luxury Car. ");
    }
}
