package com.itheim.demo13;

import com.itheim.demo8.Director;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author wz
 * @create 2019-02-21 10:50
 */
class Student<E> {
    private String  name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class s extends Student{

    public s() {
    }
}
public class Demo {
    private static void printString(Consumer<String> data, String str) {
        data.accept(str);
    }
    public static void main(String[] args) {

    }

}
