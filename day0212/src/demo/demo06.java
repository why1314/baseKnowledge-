package demo;


import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author wz
 * @create 2019-02-12 20:19
 */
public class demo06 {
    public static void main(String[] args) throws ParseException {
        String[] str = {"010", "3223", "666", "7890987", "123123"};
        int num=0;
        for (int i = 0; i < str.length; i++) {
            String s = str[i];
            StringBuilder builder = new StringBuilder(s);
            String s1 = builder.reverse().toString();
            if (!s.equals(s1)){
                System.out.println(str[i]+"【不对称！】");
                continue;
            }
            System.out.println(s);
            num++;
        }
        System.out.println("该数组中对称字符串的个数为:"+num);
    }
}
