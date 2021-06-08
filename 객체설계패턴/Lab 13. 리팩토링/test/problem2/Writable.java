package problem2;

import java.io.IOException;
import java.io.Writer;

public interface Writable {
    void write(String str, Writer out) throws IOException;
}
