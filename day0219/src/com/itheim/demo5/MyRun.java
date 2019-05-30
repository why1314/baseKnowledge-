package com.itheim.demo5;

/**
 * @author wz
 * @create 2019-02-19 16:18
 */
public class MyRun implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("子线程执行");
        }
    }
}
