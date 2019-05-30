package demo;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wz
 * @create 2019-02-12 20:19
 */
public class demo02 {
    public static void main(String[] args) throws ParseException {
        String str = new String("2018-03-04");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(str);
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
        String format1 = format.format(parse);
        System.out.println(format1);

    }

}
