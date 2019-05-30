package com.itheima.demo10;

/**
 * @author wz
 * @create 2019-02-22 11:29
 */
public class Demo {
    public static void main(String[] args) {
        getIntegerArray(4, Integer[]::new);
        getIntegerArray(10, n -> new Integer[n]);
    }

    static void getIntegerArray(int length, ArrayBuilder<Integer> builder) {
        Integer[] integers = builder.buildArray(length);
        System.out.println(integers);
    }
}
