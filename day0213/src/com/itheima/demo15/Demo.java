package com.itheima.demo15;

import com.sun.org.apache.regexp.internal.RE;

import java.util.Random;

/**
 * @author wz
 * @create 2019-02-13 19:09
 */
/*1.定义一个方法checkMsg，可以检测一个字符串中是否只包含大写字母、小写字母、数字。如果是：返回true，否则：返回false
2.测试这个方法。
提示：此方法应该有一个String参数，表示要检查的字符串。另外此方法还应该有一个boolean的返回值，表示检查的结果。
*/
public class Demo {
    public static void main(String[] args) {
        System.out.println(checkMsg("adjhaljsdhalda1213131"));
    }

    public static boolean checkMsg(String s) {
        boolean is = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) <= 'z' && s.charAt(i) >= 'a' || s.charAt(i) <= 'Z' && s.charAt(i) >= 'A' || s.charAt(i) <= '9' && s.charAt(i) >= '0') {
                is = true;
            } else {
                return false;
            }


        }
        return is;
    }
}
