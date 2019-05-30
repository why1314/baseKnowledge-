package com.itheima.demo2;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * @author wz
 * @create 2019-02-25 11:02
 */

//Properties
public class Demo {
    public static void main(String[] args) {
//        write();
        read();
    }
    public static void read() {
        Properties pro = new Properties();
        try (FileReader reader = new FileReader("demo.Properties")) {
            pro.load(reader);
            Set<String> nameSet = pro.stringPropertyNames();
            for (String s : nameSet) {
                System.out.println(s+" = "+pro.getProperty(s));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void write() {
//        封装Properties对象
        Properties pro = new Properties();
        pro.setProperty("文化", "gg");
        pro.setProperty("案件", "ds");
        pro.setProperty("安康", "啊哒");
int a;
        try (FileWriter fos = new FileWriter("demo.Properties")) {
            pro.store(fos, "why");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
