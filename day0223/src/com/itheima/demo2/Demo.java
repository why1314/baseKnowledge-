package com.itheima.demo2;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author wz
 * @create 2019-02-23 9:22
 */
public class Demo {
    public static void main(String[] args) {
        File file = new File("H:\\传智播客\\传智播客北京黑马2016年7月就业班\\17、面试资料\\面试视频指导+简历+面试题\\java面试题库");
        System.out.println(file.length());
        fun1(file);

    }

    public static void fun1(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isFile()) {
                    System.out.println(f.getName());
                } else {
                    System.out.println(f.getName());
                    fun1(f);
                }
            }
        }

    }
}
