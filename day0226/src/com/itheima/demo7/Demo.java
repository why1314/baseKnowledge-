package com.itheima.demo7;
//练习一:对象的序列化
//练习二:对象的反序列化

import java.io.*;

/**
 * @author wz
 * @create 2019-02-26 17:37
 */
/*
描述:定义一个学生类，包含姓名，年龄，性别等成员变量，提供setters和getters方法以及构造方法。
在测试类中创建一个学生对象，给学生对象的三个成员变量赋值。然后将该对象保存到当前项目根目录下的stu.txt文件中。
* */
public class Demo {
    public static void main(String[] args) {
        Student stu = new Student("ww", "18", "女");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stu.txt"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stu.txt"))
        ) {
//            序列化流
            oos.writeObject(stu);
//            反序列化流
            Student o =(Student) ois.readObject();
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
