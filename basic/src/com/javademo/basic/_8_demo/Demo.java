package com.javademo.basic._8_demo;

import java.util.Random;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        // 一些练习

        // 机票
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入机票原价：");
//        double originPrice = sc.nextDouble();
//
//        System.out.println("请输入舱位类型：");
//        String type = sc.next();
//
//        System.out.println("请输入航班月份：");
//        int month = sc.nextInt();
//
//        double finalPrice = calculatePrice(originPrice, type, month);
//        System.out.println("机票优惠后的价格是：" + finalPrice);


        // 随机生成验证码：数字，大写字母，小写字母
        Scanner codeSc = new Scanner(System.in);
        System.out.println("请输入验证码位数：");
        int digit = codeSc.nextInt();

        System.out.println("请输入生成验证码个数：");
        int num = codeSc.nextInt();

        String res = createCode(digit, num);
        System.out.println("生成的验证码为：" + res);
    }

    /**
     * 计算机票优惠价格
     * @param price: 价格
     * @param type: 舱位种类
     * @param month: 月份
     * @return 优惠后的价格
     */
    public static double calculatePrice(double price, String type, int month) {
        if (month > 4 && month < 11) { // 旺季，5-10
            switch (type) {
                case "top":
                    return price * 0.9;
                case "economy":
                    return price * 0.85;
                default:
                    System.out.println("舱位信息输入有误");
                    return  -1;
            }
        } else if(month > 0 && month < 5 || month == 11 || month == 12) { // 淡季，11-4
            switch (type) {
                case "top":
                    return price * 0.7;
                case "economy":
                    return price * 0.65;
                default:
                    System.out.println("舱位信息输入有误");
                    return  -1;
            }
        } else {
            System.out.println("月份信息输入有误");
            return -1;
        }
    }

    /**
     * 随机生成验证码，包含数字和大小写字母
     * @param digit 验证码位数
     * @param num 生成的验证码个数
     * @return 生成的验证码
     */
    public static String createCode(int digit, int num) {
        Random random = new Random();
        String[] codeArr = new String[num];

        for (int i = 0; i < num; i++) {
            String curCode = "";
            for (int j = 0; j < digit; j++) {
                int type = random.nextInt(3); // 决定是数字，大写字母，小写字母
                switch (type) {
                    case 0: // 数字
                        curCode += random.nextInt(10);
                        break;
                    case 1: // 大写字母
                        curCode += (char) (random.nextInt(26) + 65);
                        break;
                    case 2: // 小写字母
                        curCode += (char) (random.nextInt(26) + 97);
                        break;
                }
            }
            codeArr[i] = curCode;
        }

        return array2String(codeArr);
    }

    /**
     * 数组转换为字符串
     * @param arr
     * @return
     */
    public static String array2String(String[] arr) {
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            res += i == arr.length - 1 ? arr[i] : arr[i] + ", ";
        }

        return  res;
    }
}
