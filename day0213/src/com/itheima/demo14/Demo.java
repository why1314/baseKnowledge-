package com.itheima.demo14;

import java.util.Random;

/**
 * @author wz
 * @create 2019-02-13 19:09
 */
/*1.定义一个长度为20的int型数组arr
  2.要求生成20个1-100(范围包括1和100)的随机数，并存入arr中，要求20个数字不能重复。
*/
public class Demo {
    public static void main(String[] args) {
//        声明一个int类型的数组
        int[] ints = new int[20];
//        声明随机数对象
        Random rd = new Random();
//        循环20次
        for (int i = 0; i < ints.length; i++) {
//            生成1-100的随机数
            int num = rd.nextInt(100) + 1;
//            声明一个状态码
            int stateCode = 0;
//            对比已存数据是否有相同的
            for (int j = 0; j < i; j++) {
                if (num == ints[j]) {
//                  用于抵消本次生成随机数的次数
                    i--;
//                  记录状态用于判断
                    stateCode = 1;
                    break;
                }
            }
            if (stateCode == 1) {
                continue;
            }
            ints[i] = num;
            System.out.print(num + "\t");
        }
    }
}
