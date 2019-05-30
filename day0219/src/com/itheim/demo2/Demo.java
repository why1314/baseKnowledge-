package com.itheim.demo2;

/**
 * @author wz
 * @create 2019-02-19 9:38
 */
public class Demo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        t1.run();
    }
}
