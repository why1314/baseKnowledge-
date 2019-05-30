package com.itheim.demo6;

/**
 * @author wz
 * @create 2019-02-19 16:23
 */
public class Demo {
    public static void main(String[] args) {

         new Thread(){
             @Override
             public void run() {
                 super.run();
             }
         };


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("显示画面");
                }
            }
        });

        t2.start();
    }
}
