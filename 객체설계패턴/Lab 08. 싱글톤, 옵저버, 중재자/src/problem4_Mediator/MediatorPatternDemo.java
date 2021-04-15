package problem4_Mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        ChatRoom chatroom = new ChatRoom();
        User park = new User("Park Seri", chatroom);
        User gildong = new User("Gildong", chatroom);

        park.sendMessage("Hi! Park Seri!");
        gildong.sendMessage("Hello! Gildong!");
    }
}
