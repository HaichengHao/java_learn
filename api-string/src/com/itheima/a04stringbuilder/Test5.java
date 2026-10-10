package com.itheima.a04stringbuilder;

import java.util.Scanner;
/*
键盘录入任意长度的字符串,按照长度为8拆分每个输入字符串并进行输出
长度不是8整数倍的字符串在后面补数字0，空字符串不处理
 */
public class Test5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s = sc.next();
        int line_count = s.length() / 8; //获取行数,取整
        System.out.println(line_count);
        int remainder = s.length() % 8;
        for (int i = 0; i < line_count; i++) {
            int begin = i * 8;
            int end = begin+ 8;
            String substring = s.substring(begin, end);// 0-7 8-15...
            System.out.println(substring);
//            System.out.println("\n");
        }
        if (remainder != 0) {
            int begin = line_count * 8;
            int end = begin + remainder;
            String substring = s.substring(begin, end);
            System.out.println(substring+"0".repeat(8-remainder));
        }

    }
}
