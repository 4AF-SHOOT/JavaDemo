package com.javademo.basic._6_array;

import java.util.Random;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        // 数组， 引用数据类型；存储的是地址信息
        // 强类型，什么类型的数组，就要存什么类型的数据
        // 数组一旦定义出来，程序执行的过程中，长度、类型就固定了
        int[] arr = {1, 2, 3};
        System.out.println(arr[1]);
        // 1. 静态初始化数组
        // 2. 动态初始化数组
        // 3. 数组的遍历  for循环
        // 4. 常见问题


        // 1. 静态初始化数组
        //  - 数据类型[] 数组名称 = new 数据类型[] {x, x, x...}
        //  - 数据类型[] 数组名称 = {x, x, x...}
        //  - 数据类型 数组名称[] = {}
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int arr3[] = {1, 2, 3};

        System.out.println(arr1); // 数组的地址：[I@1540e19d；[: 代表数组类型 I: 代表Int
        System.out.println(arr1[1]);
        arr1[1] = 100;
        System.out.println(arr1[1]);
        System.out.println(arr1.length);


        /* 2. 动态初始化数组
             - 定义时，只确定元素的类型和数组的长度，之后再存入具体数据
            - 数据类型[] 数组名 = new 数据类型[长度]  —— 有默认值，int默认值是0；引用类型默认值是null
            - 默认值：
                - 基本类型：
                    - byte, short, char, int, long => 0
                    - float, double => 0.0
                    - boolean => false
                - 引用类型：类, 接口, 数组, String => null
        */

        int[] arr4 = new int[3];
        arr4[2] = 2;
        System.out.println(arr4[1]);


        int[] money = {16, 26, 36, 6, 100};
        int sum = 0;
        for (int i = 0; i < money.length; i++) {
            sum += money[i];
        }
        System.out.println(sum);


        int[] score = {15, 9000, 10000, 20000, 9500, -5};
        int max = score[0];
        int min = score[0];
        for (int i = 1; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            }
            if (min > score[i]) {
                min = score[i];
            }
        }
        System.out.println(max);
        System.out.println(min);


        Scanner sc = new Scanner(System.in);
        Random random = new Random();
//        int[] numArr = new int[5];
//        for (int i = 0; i < numArr.length; i++) {
//            numArr[i] = random.nextInt(20) + 1;
//        }
//        System.out.println("猜数字，请输入数字：");
//        OUT:
//        while (true) {
//            int inp = sc.nextInt();
//            for (int i = 0; i < numArr.length; i++) {
//                if (inp == numArr[i]) {
//                    System.out.println("猜中咯，索引是：" + i);
//                    break OUT;
//                }
//            }
//            System.out.println("未猜中，请继续");
//        }
//        for (int i = 0; i < numArr.length; i++) {
//            System.out.print(numArr[i] + "\t");
//        }


//        int[] nums = {1, 2, 3, 4, 5};
//        for (int i = 0; i < nums.length; i++) {
//            int index = random.nextInt(nums.length);
//            int temp = nums[i];
//            nums[i] = nums[index];
//            nums[index] = temp;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + "\t");
//        }

        int[] nums = {3, 6, 1, 2, 5, 4};
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                int temp;
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println("冒泡：");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }


        // 4. 常见问题
        /*
            1. 数组越界: ArrayIndexOutOfBoundsException
            2. 空指针异常: NullPointerException
         */

    }
}
