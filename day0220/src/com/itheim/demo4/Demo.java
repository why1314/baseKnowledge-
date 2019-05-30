package com.itheim.demo4;

/**
 * @author wz
 * @create 2019-02-20 15:26
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
