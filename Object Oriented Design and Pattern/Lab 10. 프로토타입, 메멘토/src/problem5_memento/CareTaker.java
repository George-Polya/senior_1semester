package problem5_memento;
/**
 * 2016112158 김희수
 * Memento 객체를 보관하고 저장하는 것을 담당
 */

import java.util.Stack;

public class CareTaker {
    Stack<Memento> mementoStk = new Stack<>();

    public void push(Memento memento) {
        mementoStk.push(memento);
    }

    public Memento pop() {
        return mementoStk.pop();
    }
}
