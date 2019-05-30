package com.itheima.demo4;

import java.io.*;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author wz
 * @create 2019-02-22 11:29
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        File file = new File("dhs.txt");
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream("dasd.txt");
        byte[] bytes = new byte[1024 * 1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();
    }

}
