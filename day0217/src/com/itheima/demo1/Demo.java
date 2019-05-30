package com.itheima.demo1;

import java.util.Arrays;

/**
 * @author wz
 * @create 2019-02-17 16:05
 */
/*
* 冒泡排序 相邻两元素之间进行比较
* */
public class Demo {
    public static void main(String[] args) {
        int[] arr={6,3,8,2,9,1};

//        遍历的趟数
        for (int j = 0; j < arr.length-1; j++) {
//            每一趟交换的次数    i最大为arr.length-2-j  第一次i=0； j=0  i最大为4 ，0---4 交换5次
            for (int i = 0; i < arr.length-1-j; i++) {
                if (arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
