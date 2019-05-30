package com.itheima.demo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wz
 * @create 2019-02-18 16:00
 */
/*每一个学生(Student)都有姓名和分数,分数永远不能为负数
如果老师给学生赋值一个负数,抛出一个自定异常
*/
public class Demo {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("hdsgaj");
        try {
            stu.setScore(1);
        } catch (ScoreException e) {
            System.out.println(e.getMessage());
        }
    }
}
