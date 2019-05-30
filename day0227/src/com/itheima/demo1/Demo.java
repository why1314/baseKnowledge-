package com.itheima.demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author wz
 * @create 2019-02-27 10:03
 */
//要求在测试类中的main方法中定义List<Employee> empList，
// 生成两个程序员对象、三个经理对象、一个测试员对象，数据自定义，并添加到empList集合中。
//* 然后遍历empList计算所有人的月薪总和，并打印。打印格式：所有人的月薪总和为:xxxxx元
public class Demo {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        Coder c1 = new Coder(10000, 5000);
        Coder c2 = new Coder(15000, 10000);
        Manager m1 = new Manager(26000, 1.5);
        Manager m2 = new Manager(23000, 1.2);
        Manager m3 = new Manager(24000, 1.3);
        TestEngineer t = new TestEngineer(8000, 2000, 1.5);
//      添加到empList集合中。
        Collections.addAll(empList, c1, c2, m1, m2, m3, t);
        double sum = 0;
        for (Employee employee : empList) {
            sum += employee.getSalary();
        }
        System.out.println("所有人的月薪总和为:"+sum+"元");

    }
}
