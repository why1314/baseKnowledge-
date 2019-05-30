package com.itheim.demo7;

/**
 * @author wz
 * @create 2019-02-20 17:13
 */
public class Demo {
    public int start = 1;
    public int end = 99;

    public static void main(String[] args) {
        new Demo().method();
    }

    public void method() {
        Thread t = new Thread(() -> {
            for (; start <= end; start++) {
                System.out.println(start);
            }
        });
        t.start();
    }
}
