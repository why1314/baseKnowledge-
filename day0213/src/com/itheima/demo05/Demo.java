package com.itheima.demo05;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author wz
 * @create 2019-02-13 19:09
 */
public class Demo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 4};
        ArrayList<Integer> integers = tran(arr);
        System.out.println(integers);
    }

    public static ArrayList<Integer> tran(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}
