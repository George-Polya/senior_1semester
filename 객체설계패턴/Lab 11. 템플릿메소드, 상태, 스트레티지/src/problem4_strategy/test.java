package problem4_strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static int partition(String[] stringArray, int idx1, int idx2) {
        String pivotValue = stringArray[idx1];
        while (idx1 < idx2) {
            String value1;
            String value2;
            while ((value1 = stringArray[idx1]).compareTo( pivotValue ) < 0) {
                idx1 = idx1 + 1;
            }
            while ((value2 = stringArray[idx2]).compareTo( pivotValue ) > 0) {
                idx2 = idx2 - 1;
            }
            stringArray[idx1] = value2;
            stringArray[idx2] = value1;
        }
        return idx1;
    }
    public static void QuicksortString(String[] stringArray, int idx1, int idx2) {
        if (idx1 >= idx2) {
            // we are done
            return;
        }
        int pivotIndex = partition(stringArray, idx1, idx2);
        QuicksortString(stringArray, idx1, pivotIndex);
        QuicksortString(stringArray, pivotIndex+1, idx2);
    }
    public static void QuicksortString(String[] stringArray) {
        QuicksortString(stringArray, 0, stringArray.length - 1);
    }
    private static void printArray( String[] stringArray )
    {
        for (String s:stringArray) {
            System.out.print( s + " " );
        }
    }
    private static void printArray( List<String> list)
    {
        for (String s:list) {
            System.out.print( s + " " );
        }
    }


    public static void main( String[] args )
    {
        //String[] mySampleStringArray = { "Z", "D", "A", "W", "B", "Y", "C", "X" };
        List<String> list = new ArrayList<>();
        list.add("Jimmy");
        list.add("Sammual");
        list.add("Amy");
        String[] mySampleStringArray = list.toArray(new String[0]);
        QuicksortString( mySampleStringArray );
        list = Arrays.asList(mySampleStringArray);
        printArray(list);
    }
}
