package com.itheima.demo5;

/**
 * @author wz
 * @create 2019-02-22 11:29
 */
public class Demo {
    public static void main(String[] args) {
        showLongTime(() -> {
            long time = System.currentTimeMillis();
            System.out.println(time);
        });
    }

    static void showLongTime(CurrentTimePrinter currentTimePrinter) {
        currentTimePrinter.printCurrentTime();
    }
}
