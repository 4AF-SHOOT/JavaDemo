package com.javademo.basic._7_function;

public class OverLoad {
    public static void main(String[] args) {
        // 方法重载
        overLoad();
        overLoad("123");
        overLoad("123", 3);
    }

    public static void overLoad() {
        System.out.println("方法一");
    }

    public static void overLoad(String str) {
        System.out.println("方法二");
    }

    public static void overLoad(String str, int num) {
        System.out.println("方法三");
    }
}
