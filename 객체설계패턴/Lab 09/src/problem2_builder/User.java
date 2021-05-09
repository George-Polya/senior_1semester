package problem2_builder;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private String address;
    User(String fName, String lName){
        this.firstName = fName;
        this.lastName = lName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void getData(){
        System.out.println(firstName+" ");
        System.out.println(lastName+" ");
        if(age!=0) System.out.println(age+" ");
        if(phone!="") System.out.println(phone+" ");
        if(address!="") System.out.println(address);
    }

    public void init(){
        firstName = "";
        lastName = "";
        age = 0;
        phone = "";
        address = "";
    }
}
