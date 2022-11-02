package com.javademo.basic._9_1_object;

public class ClassDemo_Car {
    /**
     * 成员变量
     */
    String name;
    double price;

    /**
     * 方法
     */
    public void start() {
        System.out.println(name + "启动了");
    }

    public void run() {
        System.out.println("价格是：" + price + "跑得很快");
    }
}
