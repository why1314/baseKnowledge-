package com.itheima.demo1;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author wz
 * @create 2019-02-25 9:54
 */
public class Demo {
    //    jdk7以前的异常处理方式
//    public static void main(String[] args) {
//        FileReader reader = null;
//        FileWriter writer = null;
//        try {
//            reader = new FileReader("demo.txt");
//            writer = new FileWriter("dsgfk.txt", true);
//            char[] chars = new char[1024];
//            int read = 0;
//            while ((read = reader.read(chars)) != -1) {
//                writer.write(chars, 0, read);
//                System.out.println(new String(chars, 0, read));
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (writer != null) {
//                    writer.close();
//                }
//                if (reader != null) {
//                    reader.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }
//    }

    //    jdk7以后的处理方式
    public static void main(String[] args) {
        try (
                FileReader reader = new FileReader("demo.txt");
                FileWriter writer = new FileWriter("dsgfk.txt", true);

        ) {
            char[] chars = new char[1024];
            int read = 0;
            while ((read = reader.read(chars)) != -1) {
                writer.write(chars, 0, read);
                System.out.println(new String(chars, 0, read));
            }
//            流对象不用再关闭了
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
