package com.javademo.basic._9_1_object;

public class Class {
    public static void main(String[] args) {
        // 面向对象 - 设计类
        /*
            类：是共同特征的描述（设计图）
            对象：是真实存在的具体实例
         */

        /*
        1. 设计类
            public class 类名 {
                1. 成员变量
                2. 成员方法
                3. 构造器
                4. 代码块
                5. 内部类
            }

        2. 得到类的对象
            类名 对象名 = new 类名();
            eg. Car c = new Car();
        3. 使用对象：
            - 访问属性
            - 访问行为
         */

        /*
        注意事项：
            1. 类名首字母建议大写，大驼峰；不能用关键字，必须是合法标识符
            2. 一个java文件中 可以定义多个class，但只能有一个类是public修饰，且public修饰的类名必须成为代码文件名
                - 建议一个代码文件一个类
            3. 成员变量的完整定义格式是：修饰符 数据类型 变量名称 = 初始化值；
                - 一般无需指定初始化值，存在默认值
         */

        /*
            对象
            - 内存机制：
                - 对象的内存空间在 堆内存 中开辟；
                - 堆内存中对象的成员方法，存的是地址；实际方法在方法区
            - 垃圾回收
                - 当 堆内存中的对象，没有被任何变量引用（指向）时，就会被判定为内存中的"垃圾"
                    - java中存在自动垃圾回收器，会定期进行清理
         */


        ClassDemo_Car car = new ClassDemo_Car();
        car.name = "宝马";
        car.price = 200;

        System.out.println(car.name);
        System.out.println(car.price);
        car.start();
        car.run();

        ClassDemo_Car car2 = new ClassDemo_Car();
        car2.name = "123";
        System.out.println(car2.name);
    }
}
