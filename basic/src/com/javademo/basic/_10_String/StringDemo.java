package com.javademo.basic._10_String;

public class StringDemo {
    public static void main(String[] args) {
        // String类
        /*
        1. String类代表字符串，String类定义的变量可以用于指向字符串对象，然后操作该字符串
            1. String类常被称为 不可变字符串 类型，它的对象在创建后不能被更改
                - String name = "a";
                  name += "bc";  // 重新运算赋值了，name指向新的对象；原本的对象没有变
                    // 重新运算得出的结果，是放在堆内存中的
            2. 以""方式给出的字符串对象，在 字符串常量池 中存储；（字符串常量池在堆内存）
         */

        /*
        2. 创建字符串对象，两种方式
            1. 直接使用""定义
            2. 通过String类的构造器创建对象

            - 以""方式给出的字符串对象，在字符串常量池中存储，而且相同内容只会在字符串常量池中存储一份
              通过构造器new对象，每new一次都会产生一个新对象，放在堆内存中
         */


        String name = "abc";
        System.out.println(name);

        String s1 = new String();
        System.out.println(s1);

        String s2 = new String("aaaa");
        System.out.println(s2);

        char[] chars = {'a', 'b', 'c', 'd'};
        String s3 = new String(chars);  // 根据字符数组的内容，创建字符串
        System.out.println(s3);

        byte[] bytes = {97, 98};
        String s4 = new String(bytes);
        System.out.println(s4);


        // eg
        String ss1 = new String("123"); // 创建了两个对象；一个双引号的 一个new的
        String ss2 = "123";  // 创建了0个对象

        String ss3 = "1" + "2" + "3";  // java存在编译优化机制，程序在编译时会把"1" + "2" + "3"(确定的值) 直接转成"123"
    }
}
