package com.itheim.filedemo;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wz
 * @create 2019-02-20 18:30
 */
public class Demo {
    public static void main(String[] args) {
//        File file = new File("H:\\wz.txt");
        FileOutputStream fos = null;
        FileInputStream fis = null;
        try {
            fos = new FileOutputStream("H:\\wz.txt", true);//从内存写到硬盘
            fis = new FileInputStream("H:\\wz1.txt");//从硬盘读到内存
            byte[] bytes = new byte[1024];
            int read=0;
            while ((read = fis.read(bytes)) != -1) {
                fos.write(new String(bytes,0,read).getBytes());
            }
//            fos.write("jfglauisglasd".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null)
                    fos.close();
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        file.createNewFile();
//        File[] listFiles = file.listFiles();
//        for (File s : listFiles) {
//            System.out.println(s);
//        }

//        file.delete();

//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(file.getName());
////        System.out.println(file.delete());
////        file.renameTo(new File("H:\\ww\\wz1.docx"));
//        System.out.println(file.isDirectory());
//        System.out.println(file.isFile()+"1");
//        System.out.println(file.canRead());
//        System.out.println(file.canWrite());
//        System.out.println(file.isHidden());
//        System.out.println(file.exists());
//        System.out.println(file.getAbsoluteFile());
//        System.out.println(file.getPath());
//        System.out.println(file.getName());
//        System.out.println(file.length());
////        System.out.println(file.delete());
//        System.out.println(file.lastModified());
//        Date date = new Date(1550663919159L);
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String s = format.format(date);
//        System.out.println(s);
//
    }
}
