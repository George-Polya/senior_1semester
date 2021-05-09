package problem2_builder;

public class BuilderMain {
    public static void main(String[] args) {

        String samples[] = {"firstName Kim,lastName Hee,age 25,phone 01029330743,address seoul","firstName HeeSu,lastName Kim","firstName HeeSu"};
        int size = 3;

        UserBuilder builder = new UserBuilder();
        Parser parser = new Parser(builder);
        User user;

        for(int i=0;i<size;i++){
            parser.parse(samples[i]);
            user = builder.build();
            if(user != null){ user.getData(); }
            System.out.println();
            if(i != size-1){
                builder.init();
                user.init();
            }
        }
    }
}
