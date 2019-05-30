package com.itheim.demo5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author wz
 * @create 2019-02-20 16:09
 */
@FunctionalInterface
interface IA {
    void show();
}

@FunctionalInterface
interface IB {
    int get();
}

@FunctionalInterface
interface IC {
    int get(int a, int b);
}

@FunctionalInterface
interface ID {
    void get(int a, int b);
}

public class Demo {
    public static void main(String[] args) {
//        线程池
//        ExecutorService service = Executors.newFixedThreadPool(2);
//        Thread t1=new Thread(()->{
//            for (int i = 0; i < 100; i++) {
//                System.out.println(Thread.currentThread().getName()+"     i = "+i);
//            }
//        });
//        service.submit(t1);
//        System.out.println("===================");
//        service.submit(t1);
//        System.out.println("===================");
//        service.submit(t1);
//        System.out.println("===================");
//        service.submit(t1);
//        无参无返回值
       /* IA ia = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("i = " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        ia.show();*/
//          无参有返回值
       /*int c = cale(() -> {
            return  20 + 30;
        });
        System.out.println(c);*/

        int num = getNum((a, b) -> a + b, 20, 40);
        System.out.println(num);

        ID id = (a, b) -> {
            System.out.println(a > b ? true : false);
        };
        id.get(30,40);
    }

    public static int cale(IB ib) {
        return ib.get();
    }

    public static int getNum(IC ic, int a, int b) {
        return a + b;
    }


}
