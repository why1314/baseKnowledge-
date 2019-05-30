package com.itheima.demo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wz
 * @create 2019-02-18 7:52
 */
/*在一款角色扮演游戏中,每一个人都会有名字和生命值;角色的生命值不能为负数
  要求:当一个人物的生命值为负数的时候需要抛出自定的异常
*/
public class Demo {

    public static void main(String[] args) {
        Role role = new Role();

        try {
            role.setShengmingzhi((double) -1);
        } catch (ShengmingzhiException e) {
            System.out.println(e.getMessage());
        }

    }
}
