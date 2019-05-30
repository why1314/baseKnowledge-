package com.itheim.demo8;

/**
 * @author wz
 * @create 2019-02-19 19:40
 */
public class Demo {
    public static void main(String[] args) throws InterruptedException {
        MyRun run = new MyRun();
        Thread t1 = new Thread(run);
        t1.start();
        Thread t2 = new Thread(run);
        t2.start();
        Thread.sleep(1000 );
        System.out.println("最终num = " + run.num);
    }
}
