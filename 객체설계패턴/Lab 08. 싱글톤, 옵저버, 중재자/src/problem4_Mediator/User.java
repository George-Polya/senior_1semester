package problem4_Mediator;
// 2016112158 김희수

/**
 * ChatRoom을 중재자역할로 설정할 필요가 있으며 이는 생성자에 의해 이루어짐.
 *
 */
public class User {
    private String name;
    ChatRoom chatRoom;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public void sendMessage(String message) {
        chatRoom.showMessage(this, message);
    }

}
