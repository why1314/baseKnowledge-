package com.itheim.demo4;

/**
 * @author wz
 * @create 2019-02-19 10:02
 */
/*请编写程序，分别打印主线程的名称和子线程的名称。
		要求使用两种方式实现：
			第一种方式：继承Thread类。
			第二种方法：实现Runnable接口。
*/
public class Demo {
    public static void main(String[] args) {
//
////        方式一继承Thread类。
//        MyThread t = new MyThread();
//        t.start();
//        System.out.println(Thread.currentThread().getName());
//

//        方式二：实现Runnable接口。

        MyRun run = new MyRun();
        Thread thread = new Thread(run);
        thread.start();
        System.out.println(Thread.currentThread().getName());
    }
}
