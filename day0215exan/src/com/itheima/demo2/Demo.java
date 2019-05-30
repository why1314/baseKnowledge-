package com.itheima.demo2;

/**
 * @author wz
 * @create 2019-02-15 17:06
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(checkMsg("sadhg1+ajsdgal12121"));
    }

    public static boolean checkMsg(String str) {
//        boolean is = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
//            if (c>='a'&&c<='z'||c>='A'&&c<='Z'||c>='0'&&c<='9'){
//                is=true;
//            }else {
//                return false;
//            }
//            c都不满足时
            if (!(c >= 'a' && c <= 'z') && !(c >= 'A' && c <= 'Z') && !(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }
}
