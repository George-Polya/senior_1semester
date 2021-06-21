package problem5_memento;
/**
 * 2016112158 김희수
 * GametestDrive
 * Adventurer 인스턴스를 생성하고 createMemento로 메멘토 객체 생성
 * 그후 careTaker.push로 현재 메멘토객체 저장
 * Adventurer 인스턴스의 상태를 변경(setHP(120))하고 createMenmento메멘토 객체 생성
 * push로 메멘토 객체 저장
 * careTaker.pop()을 이용해 메멘토 객체를 가져오고 restoreMemento로 상태복원
 */

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

        careTaker.push(adventurer.createMemento()); // 스택에 메멘토 100, 50, (3,3) 저장. 현재 메멘토: 100,50, (3,3)
        adventurer.printStatus();
        System.out.println();

        adventurer.setHP(120);
        careTaker.push(adventurer.createMemento()); // 스택에 메멘토 120, 50, (3,3) 저장. 현재 메멘토: 120, 50, (3,3)
        adventurer.restoreMemento(careTaker.pop()); // 메멘토 복원. 현재 메멘토: 120, 50, (3,3).
        adventurer.printStatus();
        System.out.println();

        adventurer.restoreMemento(careTaker.pop()); // 메멘토 복원: 현재 메멘토: 100, 50, (3,3)
        adventurer.printStatus();
        System.out.println();


    }
}
