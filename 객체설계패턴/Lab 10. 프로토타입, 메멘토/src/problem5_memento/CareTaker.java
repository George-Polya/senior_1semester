package problem5_memento;

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
