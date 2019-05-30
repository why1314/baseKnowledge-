package com.itheim.demo3;

/**
 * @author wz
 * @create 2019-02-19 10:02
 */
public class MyRun implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);

        }
    }
}
