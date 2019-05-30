package com.itheima.demo7;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wz
 * @create 2019-02-15 9:08
 */
public class Demo {

    public static void main(String[] args) {
        int[] arr = { 11,22,33,44,55 };
        method(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }


    }

    public static void method(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] += 100;
            }
        }
    }

}
