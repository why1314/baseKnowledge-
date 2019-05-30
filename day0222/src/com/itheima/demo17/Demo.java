package com.itheima.demo17;
//：映射：map、逐一消费：forEach

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * @author wz
 * @create 2019-02-22 11:29
 */
/*
有如下整数1，-2，-3，4，-5
使用Stream取元素绝对值并打印
* */

public class Demo {
    public static void main(String[] args) {

//        Stream.of(1,-2,-3,4,-5).map(num->{
//            if (num<0){
//                num=-num;
//            }
//            return num;
//        }).forEach(System.out::println);

        Stream.of(1,-2,-3,4,-5).map(Math::abs).forEach(System.out::println);

    }

}