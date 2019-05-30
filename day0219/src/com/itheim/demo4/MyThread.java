package com.itheim.demo4;

/**
 * @author wz
 * @create 2019-02-19 16:03
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
