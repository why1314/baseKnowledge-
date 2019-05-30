package com.itheim.demo;

/**
 * @author wz
 * @create 2019-02-20 8:32
 */
public class Demo {
    public static void main(String[] args) {
        BaoZiPu baoZi = new BaoZiPu();
        SetThread setThread=new SetThread(baoZi);
        GetThread getThread = new GetThread(baoZi);
        setThread.start();
        getThread.start();
    }
}
