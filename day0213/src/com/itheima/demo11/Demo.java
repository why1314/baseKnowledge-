package com.itheima.demo11;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author wz
 * @create 2019-02-13 19:09
 */
public class Demo {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] arr = new Integer[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 1;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer i : arr) {
            if (i >= 10) {
                list.add(i);
            }
        }
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
