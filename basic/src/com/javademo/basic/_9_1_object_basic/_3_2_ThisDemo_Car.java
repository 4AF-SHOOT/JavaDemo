package com.javademo.basic._9_1_object_basic;

public class _3_2_ThisDemo_Car {
    String name;
    double price;

    public _3_2_ThisDemo_Car() {
        System.out.println("无参构造器中");
    }

    public _3_2_ThisDemo_Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void run() {
        System.out.println("方法中" + this.name);
    }
}
