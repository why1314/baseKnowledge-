package com.itheima;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wz
 * @create 2019-02-12 10:14
 */
public class DateDemo {
    public static void main(String[] args) throws ParseException {
//        String str = "2019-02-12";
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = sdf.parse(str);
//        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
//        System.out.println(sdf1.format(date));
        System.out.println(B.c);
    }
}
class A{
  static final String c=new String("C");
  static {
      System.out.println("A");
  }
}
class B extends A{
    static {
        System.out.println("B");
    }
}