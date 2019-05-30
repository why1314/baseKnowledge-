package com.itheima.demo6;

/**
 * @author wz
 * @create 2019-02-22 11:29
 */
/*2.在测试类中定义static void getProduct(int a , int b ,IntCalc calc),
    该方法的预期行为是使用calc得到a和b的乘积并打印结果
测试getProduct(),通过lambda表达式完成需求
*/
public class Demo {
    public static void main(String[] args) {
        getProduct(30, 4, (a, b) ->
                a * b
        );
    }

    static void getProduct(int a, int b, IntCalc calc) {
        int cale = calc.cale(a, b);
        System.out.println(cale);
    }

}
