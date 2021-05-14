package problem5_memento;

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
