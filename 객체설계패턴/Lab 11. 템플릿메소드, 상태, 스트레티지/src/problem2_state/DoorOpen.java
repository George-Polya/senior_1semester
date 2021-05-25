package problem2_state;

public class DoorOpen extends DoorState {
    public DoorOpen(Door door) {
        super(door);
    }

    @Override
    public void touch() {
        door.setState(door.STAYOPEN);
    }

    @Override
    public void timeout() {
        door.setState(door.CLOSING);
    }
}
