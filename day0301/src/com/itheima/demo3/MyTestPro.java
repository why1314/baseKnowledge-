package com.itheima.demo3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author wz
 * @create 2019-03-01 12:30
 */
/*注解解析器*/
public class MyTestPro {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /*

        * */
        Class<?> c = Class.forName("com.itheima.demo3.Demo");
        Object o = c.getDeclaredConstructor().newInstance();
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {

            if (method.isAnnotationPresent(MyTest.class)){
                method.invoke(o);
            }
        }
    }
}
