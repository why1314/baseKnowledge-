package com.itheima.demo6;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author wz
 * @create 2019-02-16 9:22
 */
/*
请使用Map集合的方法完成添加元素，根据键删除，以及根据键获取值操作。
* */
public class Demo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");

//        1.遍历集合，并将序号与对应人名打印。

//        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
//        for (Map.Entry<Integer, String> entry : entrySet) {
//            System.out.println(entry.getKey()+"  "+entry.getValue());
//        }

//      2.向该map集合中插入一个编号为5姓名为李晓红的信息
        map.put(5, "李晓红");
//      3.移除该map中的编号为1的信息
        System.out.println(map.remove(1));
//      4.将map集合中编号为2的姓名信息修改为"周林"
        System.out.println(map.put(2, "周林"));
    }
}
