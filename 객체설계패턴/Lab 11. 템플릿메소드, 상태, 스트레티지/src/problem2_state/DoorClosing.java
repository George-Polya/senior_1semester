package problem2_state;

public class DoorClosing extends DoorState {
    public DoorClosing(Door door) {
        super(door);
    }

    @Override
    public void touch() {
        door.setState(door.OPENING);
    }

    @Override
    public void complete() {
        door.setState(door.CLOSED);
    }
}
