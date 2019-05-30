package com.itheim.demo;

/**
 * @author wz
 * @create 2019-02-20 15:20
 */
public class SetThread extends Thread {
    private BaoZiPu baoZi;

    public SetThread(BaoZiPu baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (true){
            baoZi.setBaoZi("包子");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
