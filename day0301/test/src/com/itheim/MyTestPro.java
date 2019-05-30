package com.itheim;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author wz
 * @create 2019-03-01 20:10
 */
public class MyTestPro {
    public static void main(String[] args) throws Exception {
        /*通过反射获取Demo类中那些方法使用了@MyTest注解，如果用了就调用这个方法*/
        Class<?> clazz = Class.forName("com.itheim.Demo");
        Method[] methods = clazz.getDeclaredMethods();
        Constructor constructor = clazz.getConstructor();
        Object obj = constructor.newInstance();

        for (Method m : methods) {
            if (m.isAnnotationPresent(MyTest.class)) {
                m.invoke(obj);
            }
        }
    }
}
