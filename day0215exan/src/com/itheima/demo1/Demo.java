package com.itheima.demo1;

import java.util.HashSet;
import java.util.Random;

/**
 * @author wz
 * @create 2019-02-15 17:06
 */
/*
* 1.定义一个长度为20的int型数组arr
* 2.要求生成20个1-100(范围包括1和100)的随机数，并存入arr中，要求20个数字不能重复。
*/
public class Demo {
    public static void main(String[] args) {
//        定义一个长度为20的int型数组
        int[] ints = new int[20];
        Random rd = new Random();

       /* 利用set集合中元素唯一的特性
       HashSet<Integer> set = new HashSet<>();
        while (set.size()<20){
            int num = rd.nextInt(100) + 1;
            set.add(num);
        }

        for (Integer integer : set) {
            System.out.print(integer+"\t");
        }
        */


//      循环产生20个随机数
        for (int i = 0; i < ints.length; i++) {
//            产生一个1-100范围内的随机数
            int num=rd.nextInt(100)+1;
//            定义一个状态码
            int state=0;
//          循环对比以前的随机数
            for (int j = 0; j <i ; j++) {
                if (ints[j]==num){
                    i--;
                    state=1;
                    break;
                }
            }
//            状态码用于记录ints[j]==num是否相同，如果相同，结束此次循环，进行下次循环
            if (state==1){
                continue;
            }else {
                ints[i]=num;
            }

        }
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]+"\t");
        }
    }
}
