package com.itheima.demo4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wz
 * @create 2019-02-18 7:52
 */
/*
创建三个子线程，在每个线程中开启10万次的循环，
线程1循环中将循环自增变量i赋值给Integer类型变量 a，
线程2循环中将字符串"黑马程序员"赋值给String类型变量b,
线程3循环中将字符串"黑马程序员"和循环自增变量i拼接后赋值给String类型变量c
分别计算三个线程完成任务所用的毫秒值
*/
public class Demo {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                long start = System.currentTimeMillis();
                for (int i = 0; i < 100000; i++) {
                    Integer a=i;
                    System.out.println("a = "+a);
                }
                long end = System.currentTimeMillis();
                System.out.println(end-start);
            }
        };
        t1.start();

        Thread t2 = new Thread(){
            @Override
            public void run() {
                long start = System.currentTimeMillis();
                for (int i = 0; i < 100000; i++) {
                    String s="黑马程序员";
                    System.out.println("s = "+s);
                }
                long end = System.currentTimeMillis();
                System.out.println(end-start);
            }
        };
        t2.start();

        Thread t3 = new Thread(){
            @Override
            public void run() {
                long start = System.currentTimeMillis();
                for (int i = 0; i < 100000; i++) {
                    String c="黑马程序员"+i;
                    System.out.println("c = "+c);
                }
                long end = System.currentTimeMillis();
                System.out.println(end-start);
            }
        };
        t3.start();
    }
}
