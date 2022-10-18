package com.javademo.basic._5_process_control;

public class ProcessControl {
    public static void main(String[] args) {
        // 流程控制；死循环、循环嵌套、break, continue
        /*
        一、流程控制：
            1. 顺序结构
            2. 分支结构：if  switch
                - switch:
                    - 表达式类型只能是：
                        - byte, short, int, char;
                        - JDK5开始支持枚举, JDK7开始支持String
                        - 不支持double, float, long
                    - case的值不能重复，且只能是字面量，不能是变量
                    - break；无break：穿透
            3. 循环结构：for  while  do...while
                - do...while:
                    - 先执行再判断
                    - 一定会先执行一次循环体
         */

//        int count = 0;
//        for (int i = 100; i < 1000; i++) {
//            // 582
//            int i1 = i % 10;
//            int i2 = i / 10 % 10;
//            int i3 = i / 100;
//            if (i1 * i1 * i1 + i2 * i2 * i2 + i3 * i3 * i3 == i) {
//                System.out.println(i);
//                count++;
//            }
//        }
//        System.out.println(count);


//        int count = 0;
//        double height = 0.1;
//        double peakHeight = 8848860;
//        while (height < peakHeight) {
//            height *= 2;
//            count ++;
//        }
//        System.out.println(count);
//        System.out.println(height);


//        int count = 0;
//        double height = 0.1;
//        double peakHeight = 8848860;
//        for ( ; height < peakHeight; ) {
//            height *= 2;
//            count ++;
//        }
//        System.out.println(count);
//        System.out.println(height);


        // do...while
        int i = 0;
        do {
            System.out.println(i);
//            i++;
        } while (i < 0);


        /*
            二、1. 死循环
                    - for(;;) {}
                    - while(true) {}
                    - do {} while(true)
                2. 嵌套循环
                3. break, continue
                    - break: 跳出并结束当前所在循环的执行
                    - continue: 用于跳出当前循环的档次执行，进入下一次循环
         */

        for (int j = 0; j < 5; j++) {
            if (j == 3) {
                continue;
            }
            System.out.println(j);

        }
    }
}
