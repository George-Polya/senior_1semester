package problem2_composite;

public class Triangle implements Shape{
    public Triangle() {

    }

    @Override
    public void draw(String str) {
        System.out.println("Drawing Triangle with color " + str);
    }
}
