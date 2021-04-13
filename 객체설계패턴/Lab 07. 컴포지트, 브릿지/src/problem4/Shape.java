package problem4;

public abstract class Shape {
    protected Color clr;

    public Shape(Color clr) {
        this.clr = clr;
    }

    public abstract void fill();
}
