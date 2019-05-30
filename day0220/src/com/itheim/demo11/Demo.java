package com.itheim.demo11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author wz
 * @create 2019-02-20 18:00
 */
public class Demo {
    public static void main(String[] args) {
        MyRunnable run = new MyRunnable();
        ExecutorService service = Executors.newFixedThreadPool(5);
        service.submit(run);
        service.submit(run);
        service.submit(run);
        service.submit(run);
    }
}
