package com.itheim.demo;

/**
 * @author wz
 * @create 2019-02-20 15:22
 */
public class GetThread extends Thread {
    private BaoZiPu baoZi;

    public GetThread(BaoZiPu baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (true){
            String baoZi = this.baoZi.getBaoZi();
            System.out.println(baoZi);
        }
    }
}
