package problem2_builder;

public class UserBuilder {
    private String firstName = "";
    private String lastName = "";
    private int age = 0;
    private String phone = "";
    private String address = "";
    private User user;
    public User build() {
        if(firstName == "" || lastName == ""){
            System.out.println("필수 요소가 입력되지 않은 데이터입니다. ");
            return null;
        }
        else{
            user = new User(firstName,lastName);
            setAgeBuild(age);
            setPhoneBuild(phone);
            setAddressBuild(address);
        }
        return user;
    }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAge(int age) { this.age = age; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setAddress(String address) { this.address = address; }
    public void setAgeBuild(int age) {
        this.user.setAge(age);
    }
    public void setPhoneBuild(String phone) {
        this.user.setPhone(phone);
    }
    public void setAddressBuild(String address) {
        this.user.setAddress(address);
    }
    public void init(){
        firstName = "";
        lastName = "";
        age = 0;
        phone = "";
        address = "";
        user = null;
    }
}
