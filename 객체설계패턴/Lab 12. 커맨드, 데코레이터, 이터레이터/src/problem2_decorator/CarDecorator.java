package problem2_decorator;

public abstract class CarDecorator implements Car {
    CarDecorator(Car car) {
        car.assemble();
    }

    public abstract void assemble();

}
