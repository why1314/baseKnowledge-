package com.itheim.demo4;

/**
 * @author wz
 * @create 2019-02-20 15:51
 */
public class SetThread extends Thread {
    private BaoZiPu bzp;

    public SetThread(BaoZiPu bzp) {
        this.bzp = bzp;
    }

    @Override
    public void run() {
        while (true) {
            bzp.setBaoZi("包子");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
