package com.itheim.demo4;

/**
 * @author wz
 * @create 2019-02-20 15:57
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
            System.out.println(baoZi);
        }
    }
}
