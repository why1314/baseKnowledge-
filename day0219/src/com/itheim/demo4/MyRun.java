package com.itheim.demo4;

/**
 * @author wz
 * @create 2019-02-19 10:02
 */
public class MyRun implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
