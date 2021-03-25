package problem1;

public class RectCalculator implements Calculable {
    private Rectangle rect;

    public RectCalculator(Rectangle rect) {
        this.rect = rect;
    }

    @Override
    public double calculateArea() {
        return rect.length * rect.width;
    }
}
