package problem4_bridge;

public class Triangle extends Shape {
    public Triangle(Color clr) {
        super(clr);
    }

    @Override
    public void fill() {
        System.out.print("Triangle filled with color ");
        clr.applyColor();
    }
}
