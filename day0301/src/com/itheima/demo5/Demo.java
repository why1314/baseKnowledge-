package com.itheima.demo5;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author wz
 * @create 2019-03-01 16:09
 */
//反射reflect
public class Demo {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("com.itheima.demo5.Student");
//        System.out.println(clazz.getName());

//        Constructor
//                Method
//        Field
//                Class
//        for (Constructor constructor : clazz.getConstructors()) {
//            Object o = constructor.newInstance();
//
//        }

        Constructor con = clazz.getDeclaredConstructor(String.class);
        con.setAccessible(true);
//        System.out.println(con.newInstance("hsd"));
        Object hh = con.newInstance("hh");
//
//        for (Constructor constructor : clazz.getConstructors()) {
//            System.out.println(constructor);
//        }
//        System.out.println("==========================");
////        System.out.println(clazz.getConstructor(String.class));
//        System.out.println("==========================");
//        for (Constructor constructor : clazz.getDeclaredConstructors()) {
//            System.out.println(constructor);
//        }
//        System.out.println("==========================");
//        System.out.println(clazz.getDeclaredConstructor(String.class));

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("=======================");
        for (Field field : clazz.getFields()) {
            System.out.println(field);
        }
        System.out.println("=======================");
        System.out.println(clazz.getDeclaredField("age"));
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(hh, "sjdglaisu");
        System.out.println(name.getName());
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("shdgajjjjjjjjjjjjjjjjshsdgddddddddddddd");
//        for (Method method : clazz.getMethods()) {
//            System.out.println(method);
//        }
        System.out.println(clazz.getMethod("getName"));
    }

}

