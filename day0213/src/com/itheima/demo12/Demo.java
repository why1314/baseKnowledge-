package com.itheima.demo12;

import java.util.ArrayList;

/**
 * @author wz
 * @create 2019-02-13 19:09
 */
public class Demo {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 4, 8, 2, 9, 8};
        for (Integer i : integers) {
            System.out.print(i + ",");
        }
        System.out.println();
        tran(integers, 3, 8);
        for (Integer a : integers) {
            System.out.print(a + ",");
        }
    }

    public static <E> void tran(E[] es, Integer a, Integer b) {
        if (a < es.length && b < es.length) {

                E e = es[a];
                es[a] = es[b];
                es[b] = e;

        } else {
            System.out.println("【索引越界】");
        }
    }

}
