package demo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wz
 * @create 2019-02-12 20:19
 */
public class demo01 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format1 = format.format(date);
        System.out.println(format1);
    }

}
