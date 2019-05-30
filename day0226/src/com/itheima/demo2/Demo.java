package com.itheima.demo2;
//练习二:高效字节输出流写出字节数组数据


import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author wz
 * @create 2019-02-26 9:12
 */
public class Demo {
    public static void main(String[] args) {
//描述:利用高效字节输出流往C盘下的e.txt文件写出一个字节数组数据，如写出：”i love java”
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("c:/e.txt"))) {
            byte[] bytes="i love java".getBytes();
            out.write(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
