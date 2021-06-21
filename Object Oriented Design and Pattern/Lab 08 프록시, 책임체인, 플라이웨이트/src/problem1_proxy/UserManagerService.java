package problem1_proxy;

public class UserManagerService {
    private static boolean loggedIn = true;

    public static boolean isUserLoggedIn() {
        return loggedIn;
    }
}
