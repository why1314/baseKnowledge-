package com.itheima.demo3;
//练习三:高效流文件复制


import java.io.*;

/**
 * @author wz
 * @create 2019-02-26 9:12
 */
/*
描述:利用高效字节输入流和高效字节输出流完成文件的复制。
要求：
1.将C盘下的c.png文件复制到D盘下
2.一次读写一个字节数组方式复制
*/

public class Demo {
    public static void main(String[] args) {
        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c:/c.png"));
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("d:/copy.png"))
        ) {
            int b=0;
            while ((b=bis.read())!=-1){
                out.write(b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
