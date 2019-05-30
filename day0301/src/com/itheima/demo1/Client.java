package com.itheima.demo1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;


public class Client {
    static String s = null;

    static Socket socket;

    static {
        try {
            socket = new Socket("192.168.134.89", 8888);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //输出线程
        new Thread(() -> {

            try {
                OutputStream outputStream = socket.getOutputStream();
                Scanner sc = new Scanner(System.in);
                while (true) {

                    outputStream.write(sc.nextLine().getBytes());

                    if (s.equalsIgnoreCase("T")) {
                        Thread.interrupted();
                    }

                }
            } catch (IOException e) {
                System.out.println("您已被移除群聊。。。");
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("你已被移除群聊。。。");
            }
            ;
        }) {
        }.start();

        //接收线程
        new Thread(() -> {
            try {
                while (true) {

                    InputStream inputStream = socket.getInputStream();

                    byte[] bytes = new byte[1024];
                    int len = inputStream.read(bytes);
                    s = new String(bytes, 0, len);

                    System.out.println(s);

                    if (s.equalsIgnoreCase("T")) {
                        Thread.interrupted();
                    }
                }
            } catch (IOException e) {
                System.out.println("您已被移除群聊。。。");
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("你已被移除群聊。。。");
            }
            ;
        }) {
        }.start();
    }
}

