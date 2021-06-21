package problem4_bridge;

public class Pentagon extends Shape {
    public Pentagon(Color clr) {
        super(clr);
    }

    @Override
    public void fill() {
        System.out.print("Pentagon filled with color ");
        clr.applyColor();
    }
}
