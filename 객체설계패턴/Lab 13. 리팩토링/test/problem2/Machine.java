package problem2;

import java.io.IOException;
import java.io.Writer;

public class Machine implements Writable{
    String name;
    String location;
    String bin;

    public Machine(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String take() {
        String result = bin;
        bin = null;
        return result;
    }

    public void write(String str, Writer out) throws IOException {
        if (str.equals("Machine")) {
            out.write("Machine " + name);
        } else if (str.equals("bin")) {
            if (bin() != null) {
                out.write(" bin=" + bin());
            }
        }
    }



//    public void checkBin(Writer out) throws IOException {
//        if (bin != null) {
//            out.write(" bin=" + bin);
//        }
//    }
//
//    public void checkLocation(Writer out) throws IOException {
//        if (location != null) {
//            out.write(" location=" + location);
//        }
//    }

    public String bin() {
        return bin;
    }

    public void put(String bin) {
        this.bin = bin;
    }

    public String name() {return name;}
}