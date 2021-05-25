package problem2_state;

public class DoorStayOpen extends DoorState {
    public DoorStayOpen(Door door) {
        super(door);
    }

    @Override
    public void touch() {
        door.setState(door.CLOSING);
    }
}
