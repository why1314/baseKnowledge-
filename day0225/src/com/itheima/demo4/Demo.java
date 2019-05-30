package com.itheima.demo4;
//练习二:IO对象Properties结合使用,设置properties文件

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

/**
 * @author wz
 * @create 2019-02-25 16:22
 */

/*
我有一个文本文件score.txt，我知道数据是键值对形式的，但是不知道内容是什么。
请写一个程序判断是否有"lisi"这样的键存在，如果有就改变其值为"100"
* */
public class Demo {
    public static void main(String[] args) {
        Properties pro = new Properties();
        try (FileReader in = new FileReader("score.txt")) {
            pro.load(in);
            Set<String> set = pro.stringPropertyNames();
            for (String s : set) {
                if (Objects.equals(s, "lisi")) {
                    pro.setProperty(s, "100");
                }
            }
            pro.store(new FileWriter("score.txt"), "hehe");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
