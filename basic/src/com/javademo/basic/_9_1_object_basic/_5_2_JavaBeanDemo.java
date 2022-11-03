package com.javademo.basic._9_1_object_basic;

public class _5_2_JavaBeanDemo {
    private String name;
    private double height;

    public _5_2_JavaBeanDemo() {
    }

    public _5_2_JavaBeanDemo(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
