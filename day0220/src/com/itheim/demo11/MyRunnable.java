package com.itheim.demo11;

/**
 * @author wz
 * @create 2019-02-20 18:01
 */
public class MyRunnable implements Runnable {
//    public MyRunnable() {
//        System.out.println("构建我比较慢....");
//        for (int i = 0; i < 5; i++) {
//            System.out.println("第：" + (i + 1) + " 秒...");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }

    @Override
    public void run() {
        System.out.println("我需要一个老师");
        try {
            Thread.sleep(1000*2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("王老师");
        System.out.println("教我java,教完后，老师回到了办公室");
//        for (int i = 0; i < 10; i++) {
//            if (i % 2 == 0) {
//                System.out.println("i = " + i);
//
//            }
//        }
    }
}
