package problem2_decorator;

public class BasicCar implements Car {
    public BasicCar() {
        //this.assemble();
    }

    @Override
    public void assemble() {
        System.out.print("Basic Car. ");
    }
}
