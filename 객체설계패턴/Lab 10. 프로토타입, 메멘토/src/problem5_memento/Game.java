package problem5_memento;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static void main(String[] args) {
        play();
    }

    static void play() {
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("Sword"));
        itemList.add(new Item("Shield"));
        Adventurer adventurer = new Adventurer(100, 50, new Position(3, 3), new Map(),
                                                itemList);

        CareTaker careTaker = new CareTaker();
        careTaker.push(adventurer.createMemento());
        adventurer.printStatus();
        System.out.println();

        adventurer.setHP(120);
        careTaker.push(adventurer.createMemento());
        adventurer.restoreMemento(careTaker.pop());
        adventurer.printStatus();
        System.out.println();

        adventurer.restoreMemento(careTaker.pop());
        adventurer.printStatus();
        System.out.println();


    }
}
