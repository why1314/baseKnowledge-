package com.itheima.demo21;
//：组合：concat、结果收集(list)


import java.util.ArrayList;
import java.util.Collections;
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
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "河北省", "山西省", "吉林省", "辽宁省",
                "黑龙江省", "陕西省", "甘肃省", "青海省", "山东省", "福建省", "浙江省",
                "台湾省", "河南省", "湖北省", "湖南省", "江西省", "江苏省", "安徽省",
                "广东省", "海南省", "四川省", "贵州省", "云南省", "北京市", "天津市",
                "上海市", "重庆市", "内蒙古自治区", "新疆维吾尔自治区", "宁夏回族自治区",
                "广西壮族自治区", "西藏自治区", "香港特别行政区", "澳门特别行政区");

//      统计三个字的省份的个数
        System.out.println(list.stream().filter(string -> string.length() == 3).count());
//      统计名字中包含方位名词的省份（东西南北）的个数
        System.out.println(list.stream().filter(string -> string.contains("东") || string.contains("西") || string.contains("南") || string.contains("北")).count());
        list.stream().filter(string -> string.contains("省")).filter(string -> string.contains("东") || string.contains("西") || string.contains("南") || string.contains("北")).forEach(System.out::println);
        String[] strings = list.stream().filter(string -> string.contains("市") || string.contains("区")).toArray(String[]::new);
        for (String s : strings) {
            System.out.println(s);
        }

    }

}