package problem4_Facade;
/**
 * SampleFormats는 파라미터로 들어온 정수입력을 여러 형식에 맞게 변환하여 출력하는 기능들을 담고 있는 클래스이다.
 * 출력 형식으로는 dateFormat(day month월 year), intFormat(#,###), dollarFormat($ #,##0,##) personFormat 등을 제공한다
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.DecimalFormat;
import java.text.MessageFormat;

class SampleFormats {
    public static void main(String[] args) {
    /* Date format. Examples:
       4 Jul 1997
       10 Mar 1979 */
        SimpleDateFormat dateFormat = new SimpleDateFormat("d MMM yyyy");
    /* A pretty integer format. Examples:
       4,235,682
       5,487
       42
    */
        DecimalFormat intFormat = new DecimalFormat("#,###");
    /* A monetary format. Examples:
       $ 4,235,670
       $ 345.23
       $ 0.48
    */
        DecimalFormat dollarFormat = new DecimalFormat("$ #,##0.##");
/* A person format using first, last, and user names. Examples:
       Weinman, Jerod [weinman]
       Davis, Janet [davisjan]
       Coahran, Marge [coahranm]
       The {x} syntax means replace with the x'th index of an array.
*/
        MessageFormat personFormat = new MessageFormat("{0}, {1} [{2}]");

        /* Tests */
        System.out.println("Date: " + dateFormat.format ( new GregorianCalendar(2005, 7,4).getTime()));


        // dateFormat.format() expects a Date object. Use
        // GregorianCalendar to construct a Calendar object and the
        // getTime() method to convert it to a Date.
        System.out.println("Integer: " +  intFormat.format(1234567) );
        System.out.println("Integer: " + intFormat.format(67.7) );
        System.out.println("Money: " + dollarFormat.format(9812345.678) );
        System.out.println("Money: " + dollarFormat.format(9812345) );
        System.out.println("Money: " + dollarFormat.format(.78) );
        System.out.println("Person: " + personFormat.format
                ( new Object[]{"Weinman","Jerod","weinman"} ) );
        // We can create and initialize an Object array on the fly, as
        // shown above.
    }
}
