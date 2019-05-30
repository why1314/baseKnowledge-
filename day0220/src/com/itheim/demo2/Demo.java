package com.itheim.demo2;

/**
 * @author wz
 * @create 2019-02-20 10:33
 */
public class Demo {
    public static void main(String[] args) {
        Thread t1 = new Thread(
                // 匿名方法
                () -> {
                    System.out.println("线程启动了");
                    for (int i = 0; i < 100; i++) {
                        System.out.println("i="+i);
                    }
                }
        );
        t1.start();

        for (int k = 0; k < 100; k++) {
            System.out.println("k="+k);
        }
    }
}
