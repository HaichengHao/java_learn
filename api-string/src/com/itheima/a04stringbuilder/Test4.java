package com.itheima.a04stringbuilder;

import java.util.Scanner;

//字符串反转
public class Test4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        String fins = sb.toString();
        System.out.println(fins);

    }
}
