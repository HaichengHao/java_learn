package com.itheima.a03stringdemo;
/*
数据脱敏

String substring(int beginIndex,int endIndex)截取
String substring(int beginIndex)截取,截取到末尾
 */
public class Test6 {
    static void main(String[] args) {
        String s = "hello,this is niko!";
        String subs = s.substring(1,3); //截取字符串索引1-3，不包含3
        System.out.println(subs);//el


        String subs2 = s.substring(3);
        System.out.println(subs2);//lo,this is niko!

    }
}
