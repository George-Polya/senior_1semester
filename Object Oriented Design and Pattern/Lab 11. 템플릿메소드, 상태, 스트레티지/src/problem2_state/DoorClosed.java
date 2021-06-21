package problem2_state;

public class DoorClosed extends DoorState {
    public DoorClosed(Door door) {
        super(door);
    }

    public void touch() {
        door.setState(door.OPENING);
    }


}
