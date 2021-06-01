package problem2_state;

import java.util.Observable;
/*
2016112158 김희수
 */
public class Door extends Observable {
    public final DoorState CLOSED = new DoorClosed(this);
    public final DoorState CLOSING = new DoorClosing(this);
    public final DoorState OPEN = new DoorOpen(this);
    public final DoorState OPENING = new DoorOpening(this);
    public final DoorState STAYOPEN = new DoorStayOpen(this);

    private DoorState state = CLOSED;

    public void touch() {
        state.touch();
    }

    public void complete() {
        state.complete();
    }

    public void timeout() {
        state.timeout();
    }

    public String status() {
        return state.status();
    }

    protected void setState(DoorState state) {
        this.state = state;
        setChanged();
        notifyObservers();
    }
}
