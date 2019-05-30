package com.itheima.demo6;
//练习二:字节输出流写出数据

import java.io.*;
import java.util.Objects;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author wz
 * @create 2019-02-25 16:22
 */

/*
从控制台循环接收用户录入的学生信息，输入格式为：学号-学生名字
将学生信息保存到D盘下面的stu.txt文件中，一个学生信息占据一行数据。
当用户输入end时停止输入。
* */
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Properties pro = new Properties();
        String next = null;
        while (true) {
            System.out.println("请输入学生信息");
            next = sc.next();
            if (Objects.equals(next, "end")) {
                break;
            }
            String[] split = next.split("-");
            pro.setProperty(split[0], split[1]);
        }

        try (FileWriter writer = new FileWriter("D:/stu.txt", true)) {
            pro.store(writer, "hh");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
