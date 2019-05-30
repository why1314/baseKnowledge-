package com.itheima.demo09;

import java.util.ArrayList;

/**
 * @author wz
 * @create 2019-02-13 19:09
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(9);
        list.add(8);
        list.add(7);
        System.out.println(listTest(list, 7));
    }

    public static Integer listTest(ArrayList<Integer> list, Integer a) {
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            if (integer == a) {
                return i;
            }
        }
        return -1;
    }

}
