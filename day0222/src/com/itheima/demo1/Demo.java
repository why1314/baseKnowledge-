package com.itheima.demo1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author wz
 * @create 2019-02-22 8:00
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("【欢迎使用学员管理系统】");
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> stuList = new ArrayList<>();
        while (true) {
            System.out.println("=====================================================================");
            System.out.println("【请选择功能编号】");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("【1.添加学员 2.修改学员 3.删除学员 4.按学号查询 5.查询所有 6.退出】");
            System.out.println("=====================================================================");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    addStudent(stuList, sc);
                    break;
                case 2:
                    updateStudent(stuList, sc);
                    break;
                case 3:
                    deleteStudent(stuList, sc);
                    break;
                case 4:
                    findById(stuList, sc);
                    break;
                case 5:
                    findAll(stuList, sc);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("【您选择的编号有误，请重新选择！！！】");
                    break;
            }
        }
    }

    private static void addStudent(ArrayList<Student> stuList, Scanner sc) {
        System.out.println("【请输入您要添加的学员编号】");
        int id = sc.nextInt();

        for (int i = 0; i < stuList.size(); i++) {
            Student stu = stuList.get(i);
            if (stu.getId() == id) {
                System.out.println("【请重新输入您要添加的学员编号】");
                id = sc.nextInt();
                i = -1;
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

        stuList.add(new Student(id, name, sex, age, brithday, score));
        System.out.println("【添加成功】");
        return;


    }

    private static void updateStudent(ArrayList<Student> stuList, Scanner sc) {
        System.out.println("【请输入您要修改的学员编号】");
        int id = sc.nextInt();

        for (int i = 0; i < stuList.size(); i++) {
            Student stu = stuList.get(i);
            if (stu.getId() == id) {
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

                if (!"0".equals(name)) {
                    stu.setName(name);
                }
                if (!"0".equals(sex)) {
                    stu.setSex(sex);
                }
                if (!"0".equals(brithday)) {
                    stu.setBreithday(brithday);
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
    }

    private static void deleteStudent(ArrayList<Student> stuList, Scanner sc) {
        System.out.println("【请输入您要删除的学员编号】");
        int id = sc.nextInt();

        for (int i = 0; i < stuList.size(); i++) {
            Student stu = stuList.get(i);
            if (stu.getId() == id) {
                System.out.println("【您确定要删除吗？y/n】");
                String str = sc.next();
                while (true) {
                    if ("y".equalsIgnoreCase(str)) {
                        stuList.remove(i);
                        System.out.println("【删除成功】");
                        return;
                    } else if ("n".equalsIgnoreCase(str)) {
                        System.out.println("【取消操作】");
                        return;
                    } else {
                        System.out.println("【请重新确定要删除吗？y/n】");
                        str = sc.next();
                    }
                }
            }
        }
        System.out.println("【错误】学号" + id + " 不存在！！！");
    }

    private static void findById(ArrayList<Student> stuList, Scanner sc) {
        System.out.println("【请输入您要查询的学员编号】");
        int id = sc.nextInt();

        for (int i = 0; i < stuList.size(); i++) {
            Student stu = stuList.get(i);
            if (stu.getId() == id) {
                System.out.println("【您要查询的学员信息如下】");
                System.out.println(stu);
            }
        }
        System.out.println("【错误】学号" + id + " 不存在！！！");
    }

    private static void findAll(ArrayList<Student> stuList, Scanner sc) {
        System.out.println("【您要查询的所有信息如下】");
        System.out.println("学号\t\t姓名\t\t性别\t\t年龄\t\t出生日期\t\t\t分数");

        if (stuList.size() == 0) {
            System.out.println("【系统无数据】");
        } else {
            for (int i = 0; i < stuList.size(); i++) {
                Student stu = stuList.get(i);
                System.out.println(stu.getId() + "\t\t" + stu.getName() + "\t\t" + stu.getSex() + "\t\t" + stu.getAge() + "\t\t" + stu.getBreithday() + "\t\t" + stu.getScore());
            }
        }

    }
}
