package problem2;

import java.io.IOException;
import java.io.Writer;

public class Robot implements Writable {
    Machine location;
    String bin;

    public Robot() {}

    public Machine location() {return location;}
    public void moveTo(Machine location) {this.location = location;}

    public void pick() {this.bin = location.take();}
    public String bin() {return bin;}

    @Override
    public void write(String str, Writer out) throws IOException {
        if (str.equals("location")) {
            if (location != null) {
                out.write(" location=" + location().name());
            }
        } else if (str.equals("bin")) {
            if (bin() != null)
                out.write(" bin=" + bin());
        }
    }

    public void release() {
        location.put(bin);
        bin = null;
    }
}
