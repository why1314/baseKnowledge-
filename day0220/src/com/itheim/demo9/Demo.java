package com.itheim.demo9;

/**
 * @author wz
 * @create 2019-02-20 17:27
 */
public class Demo {
    public static void main(String[] args) {

        int calc = invokeCalc((a, b) -> a - b, 130, 120);
        System.out.println(calc);
    }

    private static int invokeCalc(Calculator calculator, int a, int b) {
        return calculator.cale(a, b);
    }
}
