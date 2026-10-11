package com.itheima.integerTest04;

public class Test1 {
    public static void main(String[] args) {
        //1.把基本类型变成包装类
        Integer i = Integer.valueOf("200");//把字符串变成包装类对象
        System.out.println(i);


        //2.把包装类变回基本数据类型int
        //把对象里面的属性值给获取出来
        int num = i.intValue();
        System.out.println(num);

        //3.把字符串形式的整数变成int类型
        //细节:如果字符串里面有非数字的内容，那么代码会报错
        int num1 = Integer.parseInt("1234");
        System.out.println(num1);


        //4.十进制转二进制

        System.out.println(Integer.toBinaryString(16));

        //4.十进制转8进制
        System.out.println(Integer.toOctalString(9));

        //5.十进制转16进制
        System.out.println(Integer.toHexString(17));

    }
}
