package com.javademo.basic._9_1_object_basic;

public class _2_2_ConstructorDemo_Car {
    String name;
    double price;

    /**
     * 无参构造器
     */
    public _2_2_ConstructorDemo_Car() {
        System.out.println("无参构造器");
    }

    /**
     * 有参构造器
     * @param n: name
     * @param p: price
     */
    public _2_2_ConstructorDemo_Car(String n, double p) { // this之前
        System.out.println("有参构造器");
        name = n;
        price = p;
    }
}
