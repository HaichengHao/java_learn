package com.itheima.a03stringdemo;

public class Test7 {
    static void main(String[] args) {
        String str = "天空好像下雨";

        //截取字符串
        String subs = str.substring(0,3);

        String fin_str = subs+"***";

        System.out.println(fin_str);

        String subs2 = str.substring(3);
        String fin_str2 = subs2+"***";
        System.out.println(fin_str2);
    }
}
