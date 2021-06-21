package problem2_composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {
    List<Shape> shapeArr;

    public Drawing() {
        shapeArr = new ArrayList<>();
    }

    @Override
    public void draw(String str) {
        for (Shape shape : shapeArr) {
            shape.draw(str);
        }
    }

    public void add(Shape shape) {
        shapeArr.add(shape);
    }

    public void remove(Shape shape) {
        shapeArr.remove(shape);
    }

    public void clear() {
        shapeArr.clear();
        System.out.println("Clearing all the shapes from drawing");

    }
}
