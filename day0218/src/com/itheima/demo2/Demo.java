package com.itheima.demo2;


/**
 * @author wz
 * @create 2019-02-18 7:52
 */
//创建多线程对象，开启多线程。
// 在子线程中输出1-100之间的偶数，主线程输出1-100
public class Demo {
    public static void main(String[] args) {
//        Thread t = new Thread(){
//            @Override
//            public void run() {
//                for (int i = 1; i <= 100; i++) {
//                    if (i%2==0){
//                        System.out.println("k = "+i);
//                    }
//                }
//            }
//        };
//        t.start();


        MyThread t1 = new MyThread();
        t1.start();
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            }
        }
    }
}
