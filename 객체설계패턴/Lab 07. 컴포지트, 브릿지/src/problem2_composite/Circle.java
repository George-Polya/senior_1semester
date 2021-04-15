package problem2_composite;

public class Circle implements Shape {
    public Circle() {

    }

    @Override
    public void draw(String str) {
        System.out.println("Drawing Circle with color "+str);
    }
}
