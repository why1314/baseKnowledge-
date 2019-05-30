package com.itheima.demo3;
//练习一:字符输出流写出字符数据

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author wz
 * @create 2019-02-25 16:22
 */

/*
项目需求：请用户从控制台输入信息，程序将信息存储到文件Info.txt中。
可以输入多条信息，每条信息存储一行。当用户输入：”886”时，程序结束。
*/
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入信息");
            String next = sc.next();
            if (next.equals("886")) {
                System.out.println("谢谢使用！！");
                break;
            }
            try (FileWriter writer = new FileWriter("Info.txt", true)) {
                writer.write(next + "\r\n");

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
