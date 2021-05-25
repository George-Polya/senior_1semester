package problem2_state;

public abstract class DoorState {
    protected Door door;

    public DoorState(Door door) {
        this.door = door;
    }

    public abstract void touch();

    public void complete(){}


    public  void timeout(){}

    public String status() {
        String s = getClass().getName();
        return s.substring(s.lastIndexOf('.') + 1);
    }
}
