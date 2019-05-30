package com.itheima.demo8;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author wz
 * @create 2019-02-26 17:57
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("请输入信息");
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        try (PrintStream ps = new PrintStream("d.txt")) {
            ps.print(next);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
