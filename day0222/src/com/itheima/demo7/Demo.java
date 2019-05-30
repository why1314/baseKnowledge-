package com.itheima.demo7;

/**
 * @author wz
 * @create 2019-02-22 11:29
 */
public class Demo {
    public static void main(String[] args) {
        decToHex(2000, (n) -> Integer.toHexString(n));
        decToHex(2000, Integer::toHexString);
    }

    static void decToHex(int num, NumberToString nts) {
        String convert = nts.convert(num);
        System.out.println(convert);
    }
}
