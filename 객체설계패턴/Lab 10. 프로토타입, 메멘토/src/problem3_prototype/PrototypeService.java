package problem3_prototype;

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
