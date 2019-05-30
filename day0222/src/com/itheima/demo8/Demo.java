package com.itheima.demo8;

import java.util.Random;

/**
 * @author wz
 * @create 2019-02-22 11:29
 */
public class Demo {
    public static void main(String[] args) {
        RandomUtil util = new RandomUtil();
//        getRandomNumFromOneToNum(10,util::nextInt);
        getRandomNumFromOneToNum(10,util::nextInt);
        getRandomNumFromAToB(10,20, util::nextInt);
        int[] array={10,20,30};
        getRandomNumFromArray(array, util::nextInt);

    }
    static void getRandomNumFromOneToNum(int num , NumberSupplier ns){
        System.out.println(ns.getNum(num));
    }
    static void getRandomNumFromAToB(int a ,int b, NumberSupplier ns){
        System.out.println(ns.getNum(a,b));
    }
    static void getRandomNumFromArray(int[] nums, NumberSupplier ns){
        System.out.println(ns.getNum(nums));
    }
}
