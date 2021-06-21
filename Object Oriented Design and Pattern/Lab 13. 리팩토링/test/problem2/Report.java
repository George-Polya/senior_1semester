package problem2;

import java.util.*;
import java.io.*;

public class Report {
    public static void writeHeader(Writer out) throws IOException{
        out.write("FACTORY REPORT\n");
    }

    public static void writeMachines(Writer out, List<Machine> machines) throws IOException{
        for (Machine machine : machines) {
            machine.write(out);
        }
        out.write("\n");
    }

    public static void writeRobot(Writer out, Robot robot) throws IOException {
        robot.write(out);
    }

    public static void writeFooter(Writer out) throws IOException {
        out.write("========\n");
    }

    public static void report(Writer out, List<Machine> machines, Robot robot)
            throws IOException 
    {

        writeHeader(out);
        writeMachines(out, machines);
        writeRobot(out, robot);
        writeFooter(out);

    }
}