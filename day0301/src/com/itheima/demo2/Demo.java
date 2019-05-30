package com.itheima.demo2;

import com.itheima.demo3.MyTest;

/**
 * @author wz
 * @create 2019-03-01 8:15
 */

public class Demo {
    static {
        System.out.println("suydgauy");
    }

    public Demo(double d) {
        System.out.println(d);
    }

    public Demo(int s) {
        System.out.println(s);
    }

    public Demo(String s) {
        System.out.println(s);
    }

    public Demo() {
    }


    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        Class c = Class.forName("com.itheima.demo2.Demo");

        String s = c.getName();
        System.out.println(c.getConstructor());
        c.getConstructor(int.class);
        Object o = c.newInstance();
//        Class.class;
//        Constructor[] declaredConstructors = c.getConstructors();
//        for (Constructor constructor : declaredConstructors) {
//            System.out.println(constructor.toString());
//        }
    }

}
