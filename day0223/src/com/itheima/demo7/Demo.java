package com.itheima.demo7;

import java.io.*;
import java.util.stream.Stream;

/**
 * @author wz
 * @create 2019-02-23 9:22
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        File file = new File("测试文件.txt");
        file.createNewFile();
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream("测试文件.txt");
        int temp;
        while((temp = fis.read()) != -1){
            fos.write(temp);
        }
        fis.close();
        fos.close();

    }


}
