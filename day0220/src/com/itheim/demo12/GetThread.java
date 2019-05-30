package com.itheim.demo12;

/**
 * @author wz
 * @create 2019-02-20 21:49
 */
public class GetThread extends Thread {
    private BaoZiPu bzp;

    public GetThread(BaoZiPu bzp) {
        this.bzp = bzp;
    }

    @Override
    public void run() {
        while (true) {
            String baoZi = bzp.getBaoZi();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(baoZi);
        }

    }
}
