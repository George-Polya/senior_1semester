//Basics 3
public class Name {
      private String firstName;
      private String middleName;
      private String lastName;
      private boolean isThereMiddle;

    public Name(String fName, String mName, String lName) {
        firstName = fName;
        middleName = mName;
        lastName = lName;
        isThereMiddle = true;
    }
    public Name(String fName, String lName){
        firstName = fName;
        lastName = lName;
        isThereMiddle = false;
    }

    public int getNameLength()
    {
        String fullName;
        if(middleName != null){
            fullName = getFirstName()+getMiddleName()+getLastName();
        }
        else{
            fullName = getFirstName()+getLastName();
        }
        return fullName.length();
    }


    public String getFirstName() {return firstName; }
    public String getMiddleName() { return middleName; }
    public String getLastName() {return lastName; }
    public boolean getIsMiddle() {return isThereMiddle; }

    public void setFirstName(String fn) {
          firstName = fn;
      }
    public void setMiddleName(String mn) {
           middleName = mn;
      }
    public void setLastName(String ln) {
          lastName = ln;
      }

    public String getFirstAndLastName() {
            return firstName + " " + lastName;
      }

    public String getLastCommaFirst() {
		return lastName + ", "+ firstName;
  }

    public String getInits() {
        String fInit = firstName.substring(0,1);

        String lInit = lastName.substring(0,1);

        if (middleName != null) {
            String mInit = middleName.substring(0, 1);
            return fInit + mInit + lInit;
        } else {
            return fInit+lInit;
        }
    }

}

