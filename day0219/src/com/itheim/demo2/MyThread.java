package com.itheim.demo2;

/**
 * @author wz
 * @create 2019-02-19 9:39
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
