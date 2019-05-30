package com.itheima.demo14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author wz
 * @create 2019-02-22 11:29
 */
/*
1.请在测试类main方法中完成以下需求
已知有Integer[] arr = {-12345, 9999, 520, 0,-38,-7758520,941213}
a)使用lambda表达式创建Predicate对象p1,p1能判断整数是否是自然数(大于等于0)
b)使用lambda表达式创建Predicate对象p2,p2能判断整数的绝对值是否大于100
c)使用lambda表达式创建Predicate对象p3,p3能判断整数是否是偶数

遍历arr，仅利用已创建的Predicate对象(不使用任何逻辑运算符)，完成以下需求
i.打印自然数的个数
ii.打印负整数的个数
iii.打印绝对值大于100的偶数的个数
iv.打印是负整数或偶数的数的个数
* */

public class Demo {
    public static void main(String[] args) {
        Integer[] arr = {-12345, 9999, 520, 0, -38, -7758520, 941213};
//     使用lambda表达式创建Predicate对象p1,p1能判断整数是否是自然数(大于等于0)
        Predicate<Integer> p1 = num -> num >= 0;
//     使用lambda表达式创建Predicate对象p2,p2能判断整数的绝对值是否大于100
        Predicate<Integer> P2 = num2 -> num2 < 0 && -num2 > 100;
//     使用lambda表达式创建Predicate对象p3,p3能判断整数是否是偶数
        Predicate<Integer> P3 = num3 -> num3 % 2 == 0;

//遍历arr，仅利用已创建的Predicate对象(不使用任何逻辑运算符)，完成以下需求
//i.打印自然数的个数
//ii.打印负整数的个数
//iii.打印绝对值大于100的偶数的个数
//iv.打印是负整数或偶数的数的个数
//        long count1 = Stream.of(arr).filter(p1).count();
//        long count2 = Stream.of(arr).filter(p1.negate()).count();
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        for (Integer i : arr) {
            if (p1.test(i)) {
                count1++;
            }
            if (p1.negate().test(i)) {
                count2++;
            }
            if (P2.and(P3).test(i)){
                count3++;
            }
//            打印是负整数或偶数的数的个数
            if (p1.negate().or(P3).test(i)){
                count4++;
            }

        }
    }

}
