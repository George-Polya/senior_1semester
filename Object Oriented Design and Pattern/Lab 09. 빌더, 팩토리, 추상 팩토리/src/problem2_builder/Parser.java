package problem2_builder;

public class Parser {
    private UserBuilder builder;
    Parser(UserBuilder builder){
        this.builder = builder;
    }
    public void parse(String s){
        String[] datas = s.split(",");
        String[] type;
        for(int i=0;i<datas.length;i++){
            type = datas[i].split("\\s");
            if(type[0].equals("firstName")) { builder.setFirstName(type[1]); }
            if(type[0].equals("lastName")) { builder.setLastName(type[1]); }
            if(type[0].equals("age")) { builder.setAge(Integer.parseInt(type[1])); }
            if(type[0].equals("phone")) { builder.setPhone(type[1]); }
            if(type[0].equals("address")) { builder.setAddress(type[1]); }
        }
    }
}
