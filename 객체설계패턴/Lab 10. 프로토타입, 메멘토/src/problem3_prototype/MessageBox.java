package problem3_prototype;

/**
 * 2016112158 김희수
 * Product를 구현한 클래스
 * use메소드는 앞뒤를 입력받은 문자(point)로 감싸게 하고
 * createClone은 자기자신을 복사하여 새로운 인스턴스를 리턴한다
 */
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
