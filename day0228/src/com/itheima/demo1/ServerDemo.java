package com.itheima.demo1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author wz
 * @create 2019-02-28 10:26
 */
//服务器，先手信息，后发信息
public class ServerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (ServerSocket server = new ServerSocket(8888);
             //             等待链接
        ) {
//            while (true) {
            Socket socket = server.accept();
            String next = sc.next();
            InputStream in = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int len = in.read(bytes);
            System.out.println("服务器收到的信息" + new String(bytes, 0, len));

            OutputStream out = socket.getOutputStream();
            out.write(next.getBytes());
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
