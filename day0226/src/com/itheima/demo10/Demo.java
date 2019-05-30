package com.itheima.demo10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author wz
 * @create 2019-02-27 9:15
 */
public abstract class Demo {
    public int index = 10;

    public Demo() {
        index++;
        System.out.println("eaxm:"+index);
    }
}

class CzxyExam extends Demo {

    public CzxyExam(){
        index++;
        System.out.println("czxyexam:"+index);
    }

    public static void main(String[] args) {
        new CzxyExam();
    }
}

