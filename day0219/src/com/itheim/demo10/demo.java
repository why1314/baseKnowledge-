package com.itheim.demo10;

/**
 * @author wz
 * @create 2019-02-19 21:11
 */
public class demo {
    private static Object obj = new Object();

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    for (int j = 0; j < 100; j++) {
                        System.out.println("j=" + j);
                        if (j == 30) {
                            try {
                                obj.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
                System.out.println(2);
            }

        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    for (int i = 0; i < 100; i++) {
                        System.out.println("i=" + i);
                        if (i == 20) {
                            try {
                                obj.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
                System.out.println(1);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj){
                    obj.notifyAll();
                }
            }
        }).start();


    }
}
