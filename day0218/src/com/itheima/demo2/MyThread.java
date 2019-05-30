package com.itheima.demo2;

/**
 * @author wz
 * @create 2019-02-18 19:36
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i%2==0){
                System.out.println("k = "+i);
            }
        }
    }
}
