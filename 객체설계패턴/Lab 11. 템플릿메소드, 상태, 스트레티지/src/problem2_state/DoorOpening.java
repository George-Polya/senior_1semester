package problem2_state;

public class DoorOpening extends DoorState {
    public DoorOpening(Door door) {
        super(door);
    }

    @Override
    public void touch() {
        door.setState(door.CLOSING);
    }

    @Override
    public void complete() {
        door.setState(door.OPEN);
    }
}
