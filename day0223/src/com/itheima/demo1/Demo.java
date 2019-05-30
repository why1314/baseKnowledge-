package com.itheima.demo1;

import java.io.File;
import java.io.IOException;

/**
 * @author wz
 * @create 2019-02-23 9:22
 */
public class Demo {
    public static void main(String[] args) {
        File file = new File("H:/ds");
        file.mkdir();
        System.out.println(file.length());
        File file1 = new File("adsg.txt");
        File file2 = new File("H:/", "adsg.txt");
        try {
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.isHidden());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
    }
}
