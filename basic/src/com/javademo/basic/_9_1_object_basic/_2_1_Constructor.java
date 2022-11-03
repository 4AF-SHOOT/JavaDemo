package com.javademo.basic._9_1_object_basic;

public class _2_1_Constructor {
    public static void main(String[] args) {
        // 构造器
        /*
        1. 构造器：定义在类中的，可以用于初始化一个类的对象，并返回对象的地址
        2. 格式：
            修饰符 类名(参数) {...}
        3. 调用构造器得到对象
            类 变量名称 = new 构造器(..);
            eg. Car c = new Car("宝马"， 30);
        4. 构造器的分类和作用
            - 无参构造器（默认存在的）：初始化对象时，成员变量的数据均采用默认值
            - 有参构造器：在初始化对象时，同时可以接收参数为对象进行赋值
        5. 注意事项：
            - 任何类定义出来，默认自带无参构造器，写不写都有
            - 如果没手动声明无参构造器，一旦定义了有参数构造器，那么无参构造器就没有了；如果还想用无参的，就手动写一个无参构造器
         */

        _2_2_ConstructorDemo_Car car1 = new _2_2_ConstructorDemo_Car();
        System.out.println(car1.name);

        _2_2_ConstructorDemo_Car car2 = new _2_2_ConstructorDemo_Car("qwe", 20);
        System.out.println(car2.name);
        System.out.println(car2.price);
    }
}
