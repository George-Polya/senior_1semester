package problem4_Mediator;
// 2016112158 김희수
/**
 * ChatRoom가 중재자 역할을 하는 클래스라고 생각함
 * 왜냐하면 ChatRoom이 없다면 User객체 끼리 관계가 형성되어 소통할 것으로 예상된다
 * User객체가 많아지면 User클래스 내에  상대방 User객체를 많아진만큼 선언해야 할 것
 * 따라서 User - User의 관계는 M:N관계가 된다
 * 하지만 ChatRoom을 중재자로 둔다면 User-ChatRoom는 M:1 관계가 된다
 */

import java.util.Date;

public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " ["+user.getName()+"] : "+message);
    }
}
