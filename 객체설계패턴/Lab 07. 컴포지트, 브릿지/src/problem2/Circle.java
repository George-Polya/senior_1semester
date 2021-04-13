package problem2;

public class Circle implements Shape {
    public Circle() {

    }

    @Override
    public void draw(String str) {
        System.out.println("Drawing Circle with color "+str);
    }
}
