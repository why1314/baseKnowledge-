package com.itheima.demo3;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Scanner;


/**
 * @author wz
 * @create 2019-02-15 17:06
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("【欢迎登陆学员管理系统】");
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        while (true) {
            System.out.println("【1.注册 2.登陆 3.退出】");
            int option = sc.nextInt();
            switch (option) {
                case 1:
//                    注册
                    zhuChe(list, sc);
                    break;
                case 2:
//                    登陆
                    load(list, sc);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("【您输入的选项有误，请重新选择】");
                    break;
            }

        }
    }

    public static void zhuChe(ArrayList<Student> list, Scanner sc) {
        System.out.println("【请输入登陆名】");
        String name = sc.next();
        System.out.println("【请输入登陆密码】");
        String password = sc.next();

        if (list.size() == 0) {
            list.add(new Student(name, password));
            System.out.println("【注册成功】");
            return;
        } else {
            for (Student s : list) {
                if (name.equals(s.getName())) {
                    System.out.println("【错误】登录名"+name+" 已存在，请重新操作！");
                    return;
                }else {
                    list.add(new Student(name, password));
                    System.out.println("【注册成功】");
                    return;
                }
            }
        }
    }

    public static void load(ArrayList<Student> list, Scanner sc) {
        System.out.println("【请输入登陆名】");
        String name = sc.next();
        System.out.println("【请输入登陆密码】");
        String password = sc.next();
        Student stu = new Student(name, password);
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (stu.equals(s)){
                System.out.println("【登陆成功】");
                return;
            }
        }
        System.out.println("【登陆失败！！】");
    }
}
