package problem3_prototype;

public class MessageBox implements Product {
    private String point;
    private String txt;

    public MessageBox(String txt, String point) {
        this.point = point;
        this.txt = txt;
    }

    @Override
    public String use() {
        return point + txt + point;
    }

    @Override
    public Product createClone() {
        return new MessageBox(txt, point);
    }
}
