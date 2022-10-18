package com.javademo.basic._2_variable;

public class DataType {
    public static void main(String[] args) {
        // 1. 数据类型
        /*
            数据类型：
            - 基本数据类型
            - 引用数据类型：除了基本数据类型外的，eg.String

            基本数据类型：(内存占用)
                - 整型
                    - byte(1)
                    - short(2)
                    - int(4)（默认）：随便写一个整数字面量，默认是int类型；末尾加 L/l
                    - long(8)
                - 浮点型
                    - float(4)
                    - double(8)（默认）：随便写一个小数字面量，默认是double类型；末尾加 F/f
                - 字符型: char(2)
                - 布尔型: boolean(1)
        */

        // 随便写一个整数字面量，默认是int类型;末尾加 L/l
        // long lg = 1322232435435;  会报错
        long lg = 1322232435435L;

        // 随便写一个小数字面量，默认是double类型；末尾加 F/f
        // float fl = 98.2;
        float fl = 98.2F;
        double db = 98.92;


        // 2. 关键字、标识符


        // 3. 类型转换
        // 3-1: 自动类型转换：类型范围小的变量，可以直接赋值给类型范围大的变量
        //   - char可以赋给int（二进制的值，ASCII码的值）
        byte a = 10;
        int b = a;
        char c = 'a';
        int d = c;
        double e = b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);


        // 3-2: 表达式的自动类型转换：类型范围小的变量，会自动转换为类型范围大的变量再运算
        //   - 表达式的最终结果类型由表达式中的最高类型决定
        //   - 表达式中，byte、short、char 直接转换为 int 类型参与运算
        byte i = 10;
        byte j = 10;
        int k = i + j;


        // 3-3: 强制类型转换: 大范围的数据或变量，不能直接 赋值给小范围的变量
        //   - 强制类型转换可能会造成数据丢失/溢出
        //   - 浮点型强转为整型，直接丢掉小数部分，保留整数部分返回
        int a3 = 20;
        // int a3 = 200; // 取后8位(byte)
        byte b3 = (byte)a3;
        System.out.println(b3);

        double d3 = 12.345;
        int i3 = (int) d3;
        System.out.println(i3);
    }
}
