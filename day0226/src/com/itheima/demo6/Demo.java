package com.itheima.demo6;
//练习六:转换输入流的使用

import java.io.*;

/**
 * @author wz
 * @create 2019-02-26 17:37
 */
/*
*
* */
public class Demo {
    public static void main(String[] args) {
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream("a.txt"), "Gbk")) {
            int c=0;
            while ((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
