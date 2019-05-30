package com.itheim.demo9;

/**
 * @author wz
 * @create 2019-02-19 20:18
 */
public class MyRun implements Runnable {
    public int num = 0;

    @Override
    public void run() {
        through();

    }

    public synchronized void through() {
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        num++;
        System.out.println(Thread.currentThread().getName() + "已经通过隧道 ，Ta是第" + num + "个通过的");
    }
}
