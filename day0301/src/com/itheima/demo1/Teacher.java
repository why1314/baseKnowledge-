package com.itheima.demo1;

/**
 * @author wz
 * @create 2019-03-01 8:15
 */
public class Teacher {
    private Teacher() {
    }

    private static Teacher t = null;

    public synchronized static Teacher getTeacher() {
        if (t == null) {
            t=new Teacher();
        }
        return t;
    }
}
