package com.itheima.demo6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author wz
 * @create 2019-02-23 9:22
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("测试.txt");

        fos.write('g');

        fos.close();

        fos.write('d');

        fos.close();
//        File f1 = new File("shd.txt");
//        File f2 = new File("ss.txt");
//        f1.delete();
//        f2.delete();
//        if (!f1.exists()) {
//            f1.createNewFile();
//        }
//        FileInputStream fis = new FileInputStream(f1);
//        FileOutputStream fos = new FileOutputStream(f2,true);
//
//        byte[] bytes = new byte[1024*10];
//        int len=0;
//        while ((len=fis.read(bytes))!=-1){
//            fos.write(bytes,0,len);
//        }
//
//        fis.close();
//        fos.close();
    }


}
