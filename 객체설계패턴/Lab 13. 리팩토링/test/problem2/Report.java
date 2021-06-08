package problem2;

import java.util.*;
import java.io.*;

public class Report {


    public static void report(Writer out, List<Machine> machines, Robot robot)
            throws IOException 
    {
        out.write("FACTORY REPORT\n");

        Iterator<Machine> line = machines.iterator();
        while (line.hasNext()) {
            Machine machine = (Machine) line.next();
            machine.write("Machine", out);
//            out.write("Machine " + machine.name());

            machine.write("bin", out);

//            if (machine.bin() != null) {
//                out.write(" bin=" + machine.bin());
//            }

            out.write("\n");
        }
        out.write("\n");

        out.write("Robot");

        robot.write("location", out);
//        if (robot.location() != null)
//            out.write(" location=" + robot.location().name());

        robot.write("bin", out);
//        if (robot.bin() != null)
//            out.write(" bin=" + robot.bin());

        out.write("\n");



        out.write("========\n");
    }
}