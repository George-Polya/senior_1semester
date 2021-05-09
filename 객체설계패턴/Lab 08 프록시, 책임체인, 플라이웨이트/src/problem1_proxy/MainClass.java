package problem1_proxy;

public class MainClass {
    public static void main(String[] args) {
        boolean isUserLogged = UserManagerService.isUserLoggedIn();
        User user = new UserProxyHandler(isUserLogged).getUser();
        user.checkOut();
    }
}
