package demo;


import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author wz
 * @create 2019-02-12 20:19
 */
public class demo04 {
    public static void main(String[] args) {
        char[] chars = {'i', 't', 'c', 'a', 's', 'a'};
        System.arraycopy(chars, 1, chars, chars.length-1, 1);
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
    }
}
