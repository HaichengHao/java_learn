package com.itheima.a04stringbuilder;
/*
StringBUilswe硕士字符串的一个工具类,可以让拼接字符串的时候效率更高
 */
public class Test1 {
    static void main(String[] args) {
        long start = System.currentTimeMillis();

//        String s = "";//原始方式

        //StringBuilder方式
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
//            s += "abc";
            s.append("abc");
        }

        System.out.println(s);

        long endtime = System.currentTimeMillis();
        long total_time = endtime - start;
        System.out.println(total_time);//单位是毫秒 1s == 1000ms

        /*
        原始方式93ms
        stringbuilder方式5ms❗
         */
    }
}
