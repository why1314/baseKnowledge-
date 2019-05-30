package com.itheim.demo8;

/**
 * @author wz
 * @create 2019-02-19 19:40
 */
public class MyRun implements Runnable {
    public int num = 1000;

    @Override
    public  void run() {
        while (true) {
            int n = getTicket();
            System.out.println("线程:" + Thread.currentThread().getName() + " 取走一张票:" + n);
            if (n==0){
                break;
            }
        }
    }

    public  int getTicket() {
        if (num > 0) {
            int n = num;
            num--;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return n;
        } else {
            return 0;
        }
    }
}
