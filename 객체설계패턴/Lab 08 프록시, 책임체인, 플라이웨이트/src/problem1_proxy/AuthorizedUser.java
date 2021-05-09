package problem1_proxy;

public class AuthorizedUser implements User{
    @Override
    public void checkOut() {
        System.out.print("checking out...");
    }
}
