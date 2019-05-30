package com.itheima.demo18;
//：组合：concat、结果收集(list)

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author wz
 * @create 2019-02-22 11:29
 */
/*
已知数组arr1中有如下元素{郭靖，杨康}，arr2中有如下元素{黄蓉，穆念慈}，使用Stream将二者合并到List集合
* */

public class Demo {
    public static void main(String[] args) {
        String[] arr1={"郭靖","杨康"};
        String[] arr2={"黄蓉","穆念慈"};
        Stream<String> stream1 = Stream.of(arr1);
        Stream<String> stream2 = Stream.of(arr2);
        List<String> list = Stream.concat(stream1, stream2).collect(Collectors.toList());
    }

}