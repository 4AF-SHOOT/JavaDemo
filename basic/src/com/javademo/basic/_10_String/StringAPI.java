package com.javademo.basic._10_String;

public class StringAPI {
    public static void main(String[] args) {
        // String 常用API

        // 1. equals equalsIgnoreCase 比较字符串内容
        String s1 = "123abc";
        System.out.println(s1.equals("123abc"));
        System.out.println(s1.equals("123ABC"));
        System.out.println(s1.equalsIgnoreCase("123ABC"));

        // 2. length 获取字符串长度
        String s2 = "abc123name";
        System.out.println(s2.length());

        // 3. charAt(int index) 获取某个索引位置处的字符
        //   - 遍历字符串中的每个字符
        System.out.println(s2.charAt(2));

        // 4. toCharArray  把字符串转换成字符数组
        char[] chars = s2.toCharArray();

        // 5. substring 截取内容
        //   - 5.1 substring(int beginIndex, int endIndex) 包前不包后
        //   - 5.2 substring(int beginIndex) 从当前索引一直截取到最后
        System.out.println(s2.substring(1, 4));
        System.out.println(s2.substring(3));

        // 6. replace(CharSequence target, CharSequence replacement) 替换内容
        System.out.println(s2.replace("abc", "iop"));
        System.out.println(s2);

        // 7. contains(CharSequence s) 包含
        System.out.println(s2.contains("23"));

        // 8. startsWith(String prefix) 是否以...开始
        System.out.println(s2.startsWith("abf"));

        // 9. split(String s) 分割
        String s3 = "qwe,rt,yu";
        String[] arr = s3.split(",");
        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
