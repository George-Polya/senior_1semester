package problem4_Facade;
// 2016112158 김희수
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.DecimalFormat;
import java.text.MessageFormat;

/**
 * BasicFormat 클래스는 SampleFormats클래스의 여러 기능을 간단한 인터페이스를 정의하였다.
 * SampleFormats 클래스에선 각 형식에 맞게 새로운 객체를 생성했어야 했으나
 * BasicFormat 클래스에선 메소드를 static으로 정의하여 객체를 생성하지 않고도 출력형식을 지정할 수 있다.
 */

public class BasicFormat {
    public static String formatDate(Date date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("d MMM yyyy");
        return dateFormat.format(new GregorianCalendar(date.getYear() + 1900, date.getMonth() - 1,date.getDate()).getTime());

    }

    public static String formatDate(int year,int month, int day){
        month--;
        SimpleDateFormat dateFormat = new SimpleDateFormat("d MMM yyyy");
        return dateFormat.format(new GregorianCalendar(year, month, day).getTime());
    }

    public static String formatLong(long number){
        DecimalFormat intFormat = new DecimalFormat("#,###");
        return intFormat.format(number);
    }

    public static String formatMoney(double amount){
        DecimalFormat dollarFormat = new DecimalFormat("$ #,##0.##");
        return dollarFormat.format(amount);
    }
    public static String formatPerson(String firstName, String lastName, String userName){
        MessageFormat personFormat = new MessageFormat("{0}, {1} [{2}]");
        return personFormat.format(new Object[] {firstName, lastName,userName});
    }

    public static void main(String[] args) {


        /* Tests */
        System.out.println("Date: " + BasicFormat.formatDate(new GregorianCalendar(2011, 5,24).getTime()));
        System.out.println("Date: " + BasicFormat.formatDate(2011, 6,25));
        System.out.println("Integer: " +  BasicFormat.formatLong(1234567) );
        System.out.println("Integer: " +  BasicFormat.formatLong(68));
        System.out.println("Money: " +  BasicFormat.formatMoney(9812345.678) );
        System.out.println("Money: " +  BasicFormat.formatMoney(9812345) );
        System.out.println("Money: " +  BasicFormat.formatMoney(.78) );
        System.out.println("Person: " + BasicFormat.formatPerson("Weinman","Jerod","weinman"));
    }
}