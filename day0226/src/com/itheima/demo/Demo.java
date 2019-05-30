package com.itheima.demo;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author wz
 * @create 2019-02-26 19:44
 */
//改写学员管理系统
public class Demo {
    public static void main(String[] args) {
        System.out.println("【欢迎使用学员管理系统】");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("====================================================================");
            System.out.println("【请输入功能编号】");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("【 1、添加学员 2、修改学员 3、删除学员 4、按学号查询 5、查询所有 6、退出】");
            System.out.println("====================================================================");
            int option = sc.nextInt();
            switch (option) {
                case 1:
//                 添加学员到stus.txt中，需要输出流BufferedWriter,需要sc，收集数据，需要student对象封装数据
                    addStudent(sc);
                    break;
                case 2:
                    updateStudent(sc);
                    break;
                case 3:
                    deleteStudent(sc);
                    break;
                case 4:
                    findById(sc);
                    break;
                case 5:
                    findAll(sc);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("【您输入的编号有误请重新输入】");
                    break;
            }
        }


    }

    private static void findById(Scanner sc) {
        try (BufferedReader br = new BufferedReader(new FileReader("stus.txt"));) {
            System.out.println("【请输入要查询学员的学号】");
            String id = sc.next();
            Student student = null;
//            将学生数据读出，查询是否有该学员
            String str = null;
            while ((str = br.readLine()) != null) {
                String[] split = str.split(",");
                if (Objects.equals(id, split[0])) {
                    student = new Student(split[0], split[1], split[2]);
                }
            }

            System.out.println(student);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deleteStudent(Scanner sc) {
        //        用于封装数据
        ArrayList<Student> list = new ArrayList<>();
        System.out.println("【请输入要删除学员的学号】");
        String id = sc.next();
        try (BufferedReader br = new BufferedReader(new FileReader("stus.txt"));) {
//            将学生数据读出，查询是否有该学员
            String str = null;
            int num = 0;
            while ((str = br.readLine()) != null) {
                String[] split = str.split(",");
                if (!Objects.equals(id, split[0])) {
                    list.add(new Student(split[0], split[1], split[2]));
                } else {
                    num++;
                }
            }
            if (num == 0) {
                System.out.println("【学号不存在！】");
            }
//            数据读取且封装完毕，将数据覆盖到原来的位置
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("stus.txt"))) {
                for (Student stu : list) {
                    bw.write(stu.getId() + "," + stu.getName() + "," + stu.getSex());
                    bw.newLine();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void updateStudent(Scanner sc) {
        try (BufferedReader br = new BufferedReader(new FileReader("stus.txt"));) {
            //        用于封装数据
            ArrayList<Student> list = new ArrayList<>();
            System.out.println("【请输入要修改学员的学号】");
            String id = sc.next();

//            将学生数据读出，查询是否有该学员
            String str = null;
            while ((str = br.readLine()) != null) {
                String[] split = str.split(",");
                if (Objects.equals(id, split[0])) {
                    System.out.println("【请输入学员姓名】");
                    String name = sc.next();
                    System.out.println("【请输入学员性别】");
                    String sex = sc.next();
//                    封装并添加数据到集合
                    list.add(new Student(id, name, sex));
                } else {
                    list.add(new Student(split[0], split[1], split[2]));
                }
            }
//            数据读取且封装完毕，将数据覆盖到原来的位置
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("stus.txt"))) {
                for (Student stu : list) {
                    bw.write(stu.getId() + "," + stu.getName() + "," + stu.getSex());
                    bw.newLine();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void addStudent(Scanner sc) {
        ArrayList<Student> list = new ArrayList<>();
//        封装数据
        System.out.println("【请输入学员学号】");
        String id = sc.next();
        System.out.println("【请输入学员姓名】");
        String name = sc.next();
        System.out.println("【请输入性别(男/女)】");
        String sex = sc.next();
        Student stu = new Student(id, name, sex);
        try (BufferedReader br = new BufferedReader(new FileReader("stus.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("stus.txt", true))
        ) {

            String str = null;
//            当读取的数据不为null 时
            while ((str = br.readLine()) != null) {
//                切割字符串 将数据封装为一个对象
                String[] split = str.split(",");
                Student student = new Student(split[0], split[1], split[2]);
                list.add(student);
            }
            for (Student student : list) {
                if (Objects.equals(stu.getId(), student.getId())) {
                    System.out.println("【已存在相同的学号】");
                    return;
                }
            }
            bw.write(stu.getId() + "," + stu.getName() + "," + stu.getSex());
            bw.newLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void findAll(Scanner sc) {
        ArrayList<Student> list = new ArrayList<>();
        System.out.println("【您要查询的信息如下】");
//          读数据
        try (BufferedReader br = new BufferedReader(new FileReader("stus.txt"))) {

            String str = null;
            while ((str = br.readLine()) != null) {
//                切割数据
                String[] split = str.split(",");
//                封装并添加数据
                list.add(new Student(split[0], split[1], split[2]));
            }
//            遍历数据
            if (list.size() == 0) {
                System.out.println("【系统无数据】");
            } else {
                for (Student stu : list) {
                    System.out.println(stu.getId() + "," + stu.getName() + "," + stu.getSex());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
