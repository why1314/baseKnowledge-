package com.itheima.demo9;
//练习五:对象的序列化,对象输出流的使用

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author wz
 * @create 2019-02-26 17:57
 */
//描述:
//定义一个学生类，成员变量有姓名，年龄，性别，提供setters和getters方法以及构造方法
//定义一个测试类，在测试类创建多个学生对象保存到集合中，然后将集合存储到当前项目根目录下的stus.txt文件中。
//答案
public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student("ww", "18", "男");
        Student s2 = new Student("sd", "21", "女");
        Student s3 = new Student("sdv", "54", "女");
        Student s4 = new Student("gd", "33", "男");
        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list, s1, s2, s3, s4);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stus.txt"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stus.txt"))
        ) {
            oos.writeObject(list);
            ArrayList<Student> o = (ArrayList<Student>)ois.readObject();
            System.out.println(o);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
