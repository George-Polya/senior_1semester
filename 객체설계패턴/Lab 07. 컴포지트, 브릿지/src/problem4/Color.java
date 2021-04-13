package problem4;

public class Color {
    protected String clrname;

    public Color(String clrname) {
        this.clrname = clrname;
    }

    void applyColor() {
        System.out.println(clrname);
    }
}
