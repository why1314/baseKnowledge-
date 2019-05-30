package com.itheima.demo2;

import java.net.Socket;

/**
 * @author wz
 * @create 2019-02-27 21:08
 */
public class Demo {
    static int a;
    int b;
    static int c;
    public int aMethod(){
        a++;
        return a;
    }
    public int bMethod(){
        b++;
        return b;
    }

    public int cMethod(){
        c++;
        return c;
    }


    public static void main(String[] args) {
        Demo demo = new Demo();
        Demo demo1 = new Demo();
        Demo demo2 = new Demo();
        demo.aMethod();
        System.out.println(demo.aMethod());
        demo1.bMethod();
        System.out.println(demo1.bMethod());
        demo2.cMethod();
        System.out.println(demo2.cMethod());
        System.out.println(demo1.cMethod());
    }
}
