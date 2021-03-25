package problem5;

public class main {
    public static void main(String[] args) {
        Rectangle r = new Square(3);
        r.setHeight(5);
        r.setWidth(6);

        System.out.println(r.getArea());

    }
}
