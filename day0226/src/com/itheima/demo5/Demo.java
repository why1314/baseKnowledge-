package com.itheima.demo5;
//练习五:转换输出流的使用

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author wz
 * @create 2019-02-26 17:37
 */
/*
*
* */
public class Demo {
    public static void main(String[] args) {
        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("a.txt"),"GBK")) {
            writer.write("我爱Java");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
