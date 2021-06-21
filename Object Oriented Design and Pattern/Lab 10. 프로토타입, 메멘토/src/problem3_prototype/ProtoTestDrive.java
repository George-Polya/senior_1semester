package problem3_prototype;

public class ProtoTestDrive {
    public static void main(String[] args) {
        Product star = new MessageBox("TEST", "*");
        Product underbar = new MessageBox("TEST", "_");

        PrototypeService service = new PrototypeService();
        service.register("star", star);
        service.register("underbar", underbar);

        Product cloneStar = service.create("star");
        Product cloneUnderbar = service.create("underbar");

        System.out.println(cloneStar.use());
        System.out.println(cloneUnderbar.use());
    }
}
