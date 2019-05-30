package com.itheim.demo3;

import java.util.Arrays;

/**
 * @author wz
 * @create 2019-02-20 11:21
 */
//函数式接口注解
@FunctionalInterface

interface IA{
    void call(int a);

}
public class Demo {
    public static void main(String[] args) {
        IA ia = a -> {
            System.out.println(a + a);
        };
        ia.call(10);
    }

}
