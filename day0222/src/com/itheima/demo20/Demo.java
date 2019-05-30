package com.itheima.demo20;
//：组合：concat、结果收集(list)

import java.io.File;
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
class Film{
    private String name;

    public Film(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Film() {

    }
}
public class Demo {
    public static void main(String[] args) {
        ArrayList<String> world = new ArrayList<>();
        world.add("《教父》");
        world.add("《肖申克的救赎》");
        world.add("《辛德勒的名单》");
        world.add("《公民凯恩》");
        world.add("《卡萨布兰卡》");
        world.add("《教父续集》");
        world.add("《七武士》");
        world.add("《星球大战》");
        world.add("《美国美人》");
        world.add("《飞跃疯人院》");
        ArrayList<String> china = new ArrayList<>();
        Collections.addAll(china, "《霸王别姬》", "《大闹天宫》", "《鬼子来了》", "《大话西游》", "《活着》",
                "《饮食男女》", "《无间道》", "《天书奇谭》", "《哪吒脑海》", "《春光乍泄》");

        world.stream().limit(3).forEach(System.out::println);
        china.stream().skip(china.size()-5).forEach(System.out::println);

        List<String> collect = Stream.concat(world.stream().limit(5), china.stream().limit(5)).collect(Collectors.toList());
        collect.stream().map(File::new).forEach(System.out::println);


    }

}