package com.javademo.basic.operator;

public class OperatorDemo {
    public static void main(String[] args) {
        // 运算符
        /*
        运算符：
            - 1. 基本算数运算符
            - 2. +符号做连接符
            - 3. 自增自减运算符
            - 4. 赋值运算符
            - 5. 关系运算符
            - 6. 逻辑运算符
            - 7. 三元运算符
            - 8. 运算符优先级
         */

        // 1. 基本算数运算符: + - * / %
        //   - /: 两个整数相除，结果还是整数

        int a = 10;
        int b = 3;
        System.out.println(a / b); // 3
        System.out.println(a * 1.0 / b); // 小数


        // 2. +符号做连接符: "+"与字符串运算的时候，用作连接符（能算就算，不能算就连接）
        int a2 = 5;
        System.out.println("qwe" + '2');
        System.out.println("qwe" + a2);
        System.out.println(a2 + 'a'); // 102
        System.out.println(a2 + "abc"); // "5abc"
    }
}
