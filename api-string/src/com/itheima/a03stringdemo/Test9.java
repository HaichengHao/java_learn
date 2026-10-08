package com.itheima.a03stringdemo;

public class Test9 {
    static void main(String[] args) {
        String s1 = "又是一个安静的晚上";
        boolean res = s1.contains("晚上");
        System.out.println(res);

        //判断开头结尾

        boolean res1 = s1.startsWith("又");
        System.out.println(res1);

        boolean res1_1 = s1.startsWith("是",1); //判断从索引1开始是不是以“是”开头
        System.out.println(res1_1);

        boolean res2 = s1.endsWith("晚上");
        System.out.println(res2);



        //查找
        int index = s1.indexOf("一个");
        System.out.println(index);

        int index1 = s1.lastIndexOf("一个");
        System.out.println(index1);

        //判断是否为空
        String s2 = "";
        boolean res3 = s2.isEmpty();
        System.out.println(res3);

        //转字符数组 toCharArray()
        char[] chs = s1.toCharArray();
        for(char c : chs){
            System.out.print(c);
            System.out.print(",");
        }

        //大小写转换
        String s3 = "u love u, i love me";
        String s3_uppercase = s3.toUpperCase();
        System.out.println(s3_uppercase);

        String s3_lowercase = s3_uppercase.toLowerCase();
        System.out.println(s3_lowercase);

        //去除头尾空格 trim()
        String s4 = "  hello world  ";
        String s4_trim = s4.trim();
        System.out.println(s4_trim);

    }
}
