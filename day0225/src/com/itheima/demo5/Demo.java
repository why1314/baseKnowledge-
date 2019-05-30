package com.itheima.demo5;
//练习一:字节输入流使用

import java.io.*;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;

/**
 * @author wz
 * @create 2019-02-25 16:22
 */

/*
在D盘下有一个文本文件test.txt(里面的内容由数字和字母组成)
定义一个方法统计test.txt文件中’a’字符出现的次数。
比如a字符在文件中出现了10次则调用方法传入a后，方法内部输出：a出现10次
* */
public class Demo {
    public static void main(String[] args) {
        File file = new File("D:/test.txt");
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] bytes = new byte[1024];
            int len = 0;
            int sum=0;
            while ((len = fis.read(bytes)) != -1) {
                String s = new String(bytes, 0, len);
                sum+=getNum(s);
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int getNum(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Objects.equals(s.charAt(i), 'a')) {
                count++;
            }
        }
        return count;
    }

}
