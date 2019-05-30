package com.itheima.demo7;
//练习三:字符输出流写出字符数据并存到集合中


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author wz
 * @create 2019-02-25 16:22
 */

/*
需求说明：从控制台接收3名学员的信息，每条信息存储到一个Student对象中，
将多个Student对象存储到一个集合中。输入完毕后，将所有学员信息存储到文件Student.txt中。
每名学员信息存储一行，多个属性值中间用逗号隔开。
* */
public class Demo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("请输入第" + (i + 1) + "名学生的姓名：");
            String name = sc.next();
            System.out.print("请输入第" + (i + 1) + "名学生的年龄：");
            Integer age = sc.nextInt();
            list.add(new Student(name, age));
        }
        try (FileWriter writer = new FileWriter("Student.txt", true)) {
            for (Student stu : list) {
                String s = stu.getName() + "," + stu.getAge();
                writer.write(s+"\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
