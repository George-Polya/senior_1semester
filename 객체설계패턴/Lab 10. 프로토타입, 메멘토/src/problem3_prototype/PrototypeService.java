package problem3_prototype;
/**
 * 2016112158 김희수
 * register 메서드는 복사할 객체를 해시맵에 등록한다. 복사할 객체는 파라미터로 들어오고 key는 객체를 다운캐스팅한 클래스 이름
 * create 메서드는 파라미터로 들어온 클래스명에 해당하는 객체를 복사한다.
 */

import java.util.HashMap;

public class PrototypeService {
    private HashMap objectList = new HashMap<>();

    public void register(String obj, Product product) {
        objectList.put(obj, product);
    }

    public Product create(String name) {
        return ((Product) objectList.get(name)).createClone();

    }
}
