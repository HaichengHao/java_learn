package com.itheima.integerTest04;

public class Test2 {
    static void main(String[] args) {
        //自动装箱和自动拆箱
//        自动装箱:JVM会自动把基本数据类型装到一个对象中,底层调用valueOf方法
        //包装类其实是对象
        //但是对象和对象之间是不能相加的
        //但是JDK5之后支持了自动装箱和自动拆箱

        Integer i1 = 100;  //相当于Integer.valueOf(100);  其实是内存地址0x0011这种的
        int i2 = 200;

        System.out.println(i2);
        System.out.println(i1+i2);

        Integer i3 = 100;
        Integer i4 = 200;
        Integer i5 = i3+i4;
        System.out.println(i5);//300
    }
}
