package com.itheima.a02stringdemo;

public class Test {
    static void main() {
        /*
        第一种:直接赋值
        第二种: new 关键字
                public String()                 空白字符串,不含任何内容
                public String(String original)  根据传入的字符串,创建新的字符串对象
                public String(char[] chs)       根据字符数组,创建字符串对象
                public String(byte[] chs)       根据字节数组,创建字符串对象
         */


        //1. 直接赋值,最简单最常用
        String s1 = "你好";
        /*
        双引号直接赋值的时候,会检查串池
        不存在:创建新的
        存在:复用

        代码简单且节约内存
         */

        //空白字符串,不含内容
        //2. new + 空参构造
        String s2 = new String();
        System.out.println("--"+s2+"@@");


        //3. new + 有参构造
        //根据传入的字符串的内容,创建一个新的字符串对象
        String s3 = new String("hello");
        System.out.println(s3);


        //4. 根据字符数组,创建字符串对象
        char[] chs = {'a', 'b', 'c'};
        String s4 = new String(chs);

        System.out.println(s4); //abc

        //补充循环之增强for循环
        /*
        记不记得python 中的
        s = "hello"
        for i in s:
            print(i)

        或者之前的
        arr = [1,3,4,5,6]
        for i in arr:
            print(i)

        java中其实也有类似的
        譬如
        int[] numbers = {10,20,30}
        for(int i : numbers){
        system.out.print(x);
        system.out.print(",")}
         */

        for (char c : chs){
            System.out.print(c);
            System.out.print(",");
        }

        //5.new+有参构造(字节数组)
        byte[] bytes = {97,98,99,100,101}; //ascii码
        String s5 = new String(bytes);
        System.out.println(s5);

    }
}
