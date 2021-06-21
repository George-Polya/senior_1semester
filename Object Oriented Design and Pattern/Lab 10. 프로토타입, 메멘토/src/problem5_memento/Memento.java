package problem5_memento;
/**
 * 2016112158 김희수
 * 상태를 저장하는 메멘토 객체
 */

import java.util.List;

public class Memento {
    private int HP;
    private int MP;
    private Position position;
    private Map map;
    private List<Item> items;

    public Memento(int HP, int MP, Position position, Map map, List<Item> items) {
        this.HP = HP;
        this.MP = MP;
        this.position = position;
        this.map = map;
        this.items = items;
    }

    public int getHP() {
        return HP;
    }

    public int getMP() {
        return MP;
    }

    public Position getPosition() {
        return position;
    }

    public Map getMap() {
        return map;
    }

    public List<Item> getItems() {
        return items;
    }
}
