package com.itheima.demo1;
//练习一:高效字节输出流写出字节数据

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author wz
 * @create 2019-02-26 15:48
 */
public class Demo {
    public static void main(String[] args) {
//描述:利用高效字节输出流往C盘下的d.txt文件输出一个字节数。
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("C:/d.txt"))) {
            out.write("hadsgkua".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
