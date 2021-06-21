package problem5;

public class Rectangle {
    private int height;

    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return width * height;
    }

    public int getHeight() { return this.height;}
    public int getWidth() {
        return this.width;
    }

    @Override
    public String toString() {
        return "h : "+height+", w : "+width;
    }
}
