package com.itheima.demo16;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author wz
 * @create 2019-02-13 19:09
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("【欢迎登陆学员管理系统】");
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> stuList = new ArrayList<>();

        while (true) {
            System.out.println("【1.注册】 【2.登陆】 【3.退出】");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    registerStudent(stuList, sc);
                    break;
                case 2:
                    land(stuList, sc);
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }

    //登陆
    private static void land(ArrayList<Student> stuList, Scanner sc) {
        System.out.println("请输入登录名");
        String name = sc.next();
        System.out.println("请输入登陆密码");
        String password = sc.next();
        Student stu = new Student(name, password);
        for (Student s : stuList) {
            if (s.equals(stu)) {
                System.out.println("【登陆成功】");
                return;
            }
        }
        System.out.println("【登录失败！！】");
    }

    //注册
    private static void registerStudent(ArrayList<Student> stuList, Scanner sc) {
        System.out.println("请输入登录名");
        String name = sc.next();
        System.out.println("请输入登陆密码");
        String password = sc.next();
        Student stu = new Student(name, password);
        if (stuList.size() == 0) {
            stuList.add(stu);
            System.out.println("【注册成功】");
            return;
        } else {
            for (Student student : stuList) {
                if (stu.getName().equals(student.getName())) {
                    System.out.println("【错误】 登录名：" + stu.getName() + " 已存在，请重新操作");
                    return;
                }
            }
            stuList.add(stu);
            System.out.println("【注册成功】");
        }

    }
}
