package com.itheima.demo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author wz
 * @create 2019-02-16 8:06
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("【欢迎使用学员管理系统】");
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        while (true) {
            System.out.println("【==========================================================】");
            System.out.println("【请选择功能编号】");
            System.out.println("【----------------------------------------------------------】");
            System.out.println("【1.添加学员 2.修改学员 3.删除学员 4.按学号查询 5.查询所有 6.退出】");
            System.out.println("【==========================================================】");

            int option = sc.nextInt();
            switch (option) {
                case 1:
                    addStudent(list, sc);
                    break;
                case 2:
                    updateStudent(list, sc);
                    break;
                case 3:
                    deleteStudent(list, sc);
                    break;
                case 4:
                    findById(list, sc);
                    break;
                case 5:
                    findAll(list);
                    break;
                case 6:
                    System.exit(0);
            }
        }

    }

    private static void findAll(ArrayList<Student> list) {
        System.out.println("【所有信息如下】");
        System.out.println("学号\t\t姓名\t\t性别\t\t年龄\t\t出生日期\t\t\t分数");
        if (list.size() == 0) {
            System.out.println("【系统无数据】");
        } else {
            for (int i = 0; i < list.size(); i++) {
                Student stu = list.get(i);
                System.out.println(stu.getId() + "\t\t" + stu.getName() + "\t\t" + stu.getSex() + "\t\t" + stu.getAge() + "\t\t" + stu.getBrithday() + "\t\t" + stu.getScore());
            }
        }

    }

    private static void findById(ArrayList<Student> list, Scanner sc) {
        System.out.println("【请输入要查询的学员学号】");
        int id = sc.nextInt();

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (id == stu.getId()) {
                System.out.println("【您要查询的学员信息如下】");
                System.out.println(stu);
                return;
            }
        }
        System.out.println("【错误】学号" + id + " 不存在！");
    }

    private static void deleteStudent(ArrayList<Student> list, Scanner sc) {
        System.out.println("【请输入要删除的学员学号】");
        int id = sc.nextInt();

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (id == stu.getId()) {
                System.out.println("【您确定要删除吗？y/n】");
                String str = sc.next();
                while (true) {
                    if (str.equalsIgnoreCase("y")) {
                        list.remove(i);
                        System.out.println("【删除成功】");
                        return;
                    } else if (str.equalsIgnoreCase("n")) {
                        System.out.println("【取消操作】");
                        return;
                    } else {
                        System.out.println("【请重新确定要删除吗？y/n】");
                        str = sc.next();
                    }
                }
            }
        }
        System.out.println("【错误】学号" + id + " 不存在！");
    }

    private static void updateStudent(ArrayList<Student> list, Scanner sc) {
        System.out.println("【请输入要修改的学员学号】");
        int id = sc.nextInt();

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (id == stu.getId()) {
                System.out.println("【您要修改的学员信息如下】");
                System.out.println(stu);
                System.out.println("【请输入姓名(保留原值请输入0)】");
                String name = sc.next();
                System.out.println("【请输入性别(保留原值请输入0)】");
                String sex = sc.next();
                System.out.println("【请输入年龄(保留原值请输入0)】");
                int age = sc.nextInt();
                System.out.println("【请输入出生日期(保留原值请输入0)】");
                String brithday = sc.next();
                System.out.println("【请输入分数(保留原值请输入-1)】");
                int score = sc.nextInt();

                if (!name.equals("0")) {
                    stu.setName(name);
                }
                if (!sex.equals("0")) {
                    stu.setSex(sex);
                }
                if (!brithday.equals("0")) {
                    stu.setBrithday(brithday);
                }
                if (age != 0) {
                    stu.setAge(age);
                }
                if (score != -1) {
                    stu.setScore(score);
                }
                System.out.println("【修改成功】");
                return;
            }
        }
        System.out.println("【错误】学号" + id + " 不存在！");
    }

    private static void addStudent(ArrayList<Student> list, Scanner sc) {
        System.out.println("【请输入要添加的学员学号】");
        int id = sc.nextInt();

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (id == stu.getId()) {
                System.out.println("【请重新输入要添加的学员学号】");
                id = sc.nextInt();
                i = 0;
            }
        }
        System.out.println("【请输入姓名】");
        String name = sc.next();
        System.out.println("【请输入性别】");
        String sex = sc.next();
        System.out.println("【请输入年龄】");
        int age = sc.nextInt();
        System.out.println("【请输入出生日期】");
        String brithday = sc.next();
        System.out.println("【请输入分数】");
        int score = sc.nextInt();
        list.add(new Student(id, name, sex, age, brithday, score));
        System.out.println("【添加成功】");

    }
}
