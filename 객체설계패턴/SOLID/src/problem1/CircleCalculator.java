package problem1;

public class CircleCalculator implements Calculable {
    private Circle circle;

    public CircleCalculator(Circle circle) {
        this.circle = circle;
    }

    @Override
    public double calculateArea() {
        return (22/7) * circle.radius * circle.radius;
    }
}
