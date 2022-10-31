package com.javademo.basic._7_function;

public class FunctionDemo {
    public static void main(String[] args) {
        // 方法
        /*
            1. 定义格式
                修饰符 返回值类型 方法名(形参列表) {...}  // 参数要带类型
                eg: public static int add(a, b) {...}
            2. 方法编写顺序无所谓
            3. 方法不能嵌套定义
            4. 方法调用流程，内存 —— 跟js执行栈类似
                - 方法没有被调用的时候，在方法区中的字节码文件中存放
                - 方法被调用时，需要进入到栈内存中运行
         */
        int a = 1;
        int b = 20;
        int c = sum(a, b);
        int d = sum(2, 5);
        System.out.println(c);
        System.out.println(d);
        print();
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void print() {
        System.out.println("aaaaaaaaa");
    }
}
