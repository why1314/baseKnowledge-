package com.itheim.demo12;

/**
 * @author wz
 * @create 2019-02-20 21:43
 */
public class Demo {
    public static void main(String[] args) {
        BaoZiPu baoZiPu = new BaoZiPu();

        SetThread setThread = new SetThread(baoZiPu);
        GetThread getThread = new GetThread(baoZiPu);
        setThread.start();
        getThread.start();
    }
}
