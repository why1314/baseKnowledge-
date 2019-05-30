package com.itheima;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Logger;

/**
 * @author wz
 * @create 2019-02-12 10:14
 */
public class DateDemo2 {
    public static void main(String[] args) throws ParseException {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入你的出生日期：");
//        String strDate = sc.next();//1994-11-18
//        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = sdf1.parse(strDate);
//        long time1 = date.getTime();
//        Date date1 = new Date();
//        long time2 = date1.getTime();
//        System.out.println("你出生的天数为" + ((time2 - time1) / 1000 / 3600 / 24));
//        System.out.println(date.equals(null));
//        Objects.equals(date, date1);
//        System.out.println(Integer.toHexString(Objects.hashCode(date)));
//        System.out.println(Objects.isNull(date));
//        System.out.println(Objects.nonNull(date));
//        System.out.println(date);
//        System.out.println(Objects.toString(date));
//        System.out.println(System.currentTimeMillis());
//        Date date2 = new Date(1549961882479L);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(sdf.format(date2));
//        System.out.println(System.currentTimeMillis());
//        System.out.println(new Date().getTime());
//        Date date3 = new Date();
//        date3.setTime(1549961882479L);
//        System.out.println(sdf.format(date3));
//        System.out.println(Objects.equals(date, date1));

/*        String str = "1997-02-12";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        Date date2 = sdf2.parse(str);
        System.out.println(date2);
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(sdf3.format(date2));
*/
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println(calendar);
//        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        calendar.set(Calendar.YEAR,20100);
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year + " " + (month + 1) + " " + day);

    }

}
