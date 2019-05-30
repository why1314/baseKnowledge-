package demo;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author wz
 * @create 2019-02-12 20:19
 */
public class demo03 {
    public static void main(String[] args) throws ParseException {

        GregorianCalendar gc = new GregorianCalendar(2018, 2, 14);
        int week = gc.get(Calendar.DAY_OF_WEEK);
        System.out.println(getWeek(week));
    }

    public static String getWeek(int week) {
        StringBuilder builder = new StringBuilder();
        switch (week) {
            case 1:
                builder.append("星期日");
                break;
            case 2:
                builder.append("星期一");
                break;
            case 3:
                builder.append("星期二");
                break;
            case 4:
                builder.append("星期三");
                break;
            case 5:
                builder.append("星期四");
                break;
            case 6:
                builder.append("星期五");
                break;
            case 7:
                builder.append("星期六");
                break;
        }
        return builder.toString();
    }

}
