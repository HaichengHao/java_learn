package com.itheima.a03stringdemo;

import java.util.Scanner;

/*
键盘录入一个字符串,统计该字符串中大写字母字符，小写字母字符,数字字符穿线的次数(不考虑其它字符)
 */
public class Test3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s = sc.next();

        //统计字符串中字符出现的次数
        //遍历字符串得到每一个字符
        //计数器思想

        int upperCount = 0 ;
        int lowerCount = 0 ;
        int numberCount = 0 ;


        for(int i = 0;i<s.length();i++){
            //c:依次表示每一个遍历到的字符
            char c = s.charAt(i);
            //判断当前的字符是大写，小写，还是数字
            //注意不是双引号而是单引号,如果是双引号的话就会被识别为字符串而不是ascii编号❗❗❗❗❗❗
            if(c>='a' && c<='z'){
                //小写
                lowerCount++;
            } else if (c>='A' && c<='Z') {
                //大写
                upperCount++;
            } else if (c>='0' && c<='9') {
                //数字字符 0 1 2 3 4 5 6 7 8 9
                numberCount++;

            }else {
                System.out.println("当前字符不参与统计");
            }
        }
        System.out.println("大写字母出现的次数为:"+upperCount);
        System.out.println("小写字母出现的次数为:"+lowerCount);
        System.out.println("数字字符出现的次数为:"+numberCount);
    }
}
