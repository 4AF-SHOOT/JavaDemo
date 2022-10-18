package com.javademo.basic._4_api_demo;
import java.util.Scanner;

public class APIDemo {
    public static void main(String[] args) {
        // 初步了解api的使用，具体后面学
        /*
        三个步骤：
            1. 导包：告诉程序去JDK的哪个包中找功能
            2. new
            3. 使用

            注：1. System、String是在lang包下
               2. lang包不需要我们导入，是默认的包
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int a = sc.nextInt();
        System.out.println("数字是：" + a);

        System.out.println("请输入：");
        String b = sc.next();
        System.out.println("输入是：" + b);

    }
}
