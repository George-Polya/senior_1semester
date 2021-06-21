package problem5_memento;
/**
 * 2016112158 김희수
 * Memento 객체를 생성하고 이전 상태로 되돌리는 것을 담당
 */

import java.util.ArrayList;
import java.util.List;

public class Adventurer {
    private int HP;
    private int MP;
    private Position position;
    private Map map;
    private List<Item> items;

    public Adventurer(int HP, int MP, Position position, Map map, List<Item> items) {
        this.HP = HP;
        this.MP = MP;
        this.position = position;
        this.map = map;
        this.items = items;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Memento createMemento() {
        return new Memento(HP, MP, position, map, items);
    }

    public void printStatus() {
        System.out.println("Print current status : ");
        System.out.println("HP : " + this.HP);
        System.out.println("MP : " + this.MP);
        System.out.println("Position : " + this.position.getX() + ", " + this.position.getY());


    }

    public void restoreMemento(Memento memento) {
        this.HP = memento.getHP();
        this.MP = memento.getMP();
        this.position = memento.getPosition();
        this.map = memento.getMap();
        this.items = memento.getItems();
    }
}
