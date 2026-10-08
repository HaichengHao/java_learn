package com.itheima.a03stringdemo;

import java.util.Scanner;

/*
遍历字符串

public char charAt(int index):根据索引返回字符 例如s.charAt(i);
public int length():获取字符串的长度
 */
public class Test2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s = sc.next();

        System.out.println(s.length()); //获取字符串的长度

        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);//根据索引返回字符
            System.out.println(c);
        }
    }
}
