package com.javademo.basic._7_function;

public class FunctionDemo {
    public static void main(String[] args) {
        // 方法
        /*
            1. 定义格式
                修饰符 返回值类型 方法名(形参列表) {...}  // 参数要带类型
                eg: public static int add(a, b) {...}
            2. 方法编写顺序无所谓
            3. 方法不能嵌套定义
            4. 方法调用流程，内存 —— 跟js执行栈类似
                - 方法没有被调用的时候，在方法区中的字节码文件中存放
                - 方法被调用时，需要进入到栈内存中运行
            5. 参数传递机制：值传递
                - 基本类型：数据值
                - 引用类型：地址值
            6. 方法重载：同一个类中，出现多个 方法名称 相同，但是形参列表是不同的，这些方法就是重载方法
                - => OverLoad
                - 只关心 方法名称相同，形参列表不同
                    - 形参列表不同：个数，类型，顺序不同
         */
        int a = 1;
        int b = 20;
        int c = sum(a, b);
        int d = sum(2, 5);
        int[] arr = {1, 2, 3};
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 4, 3};
        System.out.println(c);
        System.out.println(d);
        print();
        printArr(arr);
        System.out.println(searchIndex(arr, 20));
        System.out.println(isArrSame(arr1, arr2));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void print() {
        System.out.println("aaaaaaaaa");
    }

    public static void printArr(int[] arr) {
        System.out.print("[");
        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print( i == arr.length - 1 ? arr[i] : arr[i] + ", ");
            }
        }
        System.out.println("]");
    }

    public static int searchIndex(int[] arr, int num) {
        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static boolean isArrSame(int[] arr1, int[] arr2) {
        // 不判空了
        int len1 = arr1.length;
        int len2 = arr2.length;
        if (len1 == len2) {
            if (len1 != 0) {
                for (int i = 0; i < len1; i++) {
                    if (arr1[i] != arr2[i]) {
                        return false;
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
