package com.itheim.demo5;

/**
 * @author wz
 * @create 2019-02-19 16:17
 */
public class Demo {
    public static void main(String[] args) {



        MyRun run = new MyRun();
        Thread thread = new Thread(run);
        thread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程执行"+i);
        }
    }
}
