package com.itheim.demo3;

/**
 * @author wz
 * @create 2019-02-19 10:02
 */
public class Demo {
    public static void main(String[] args) {
//        匿名内部类
//         new Thread() {
//            @Override
//            public void run() {
//                super.run();
//            }
//        }.start();

        MyRun myRun = new MyRun();
        Thread t = new Thread(myRun);
        t.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName());
        }


        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName()+"  "+i);
                }
            }
        }).start();

    }
}
