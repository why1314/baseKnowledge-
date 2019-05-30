package com.itheima.demo13;

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
        tran(integers);
        for (Integer a : integers) {
            System.out.print(a + ",");
        }
    }

    public static <E> void tran(E[] es) {
        for (int i = 0; i < es.length/2; i++) {
            E e=es[i];
            es[i]=es[es.length-1-i];
            es[es.length-1-i]=e;
        }
    }

}
