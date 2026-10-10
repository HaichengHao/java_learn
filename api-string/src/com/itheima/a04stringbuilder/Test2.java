package com.itheima.a04stringbuilder;

public class Test2 {
    static void main(String[] args) {
        /*
        StringBuilder的构造方法:
            public StringBuilder()   空参构造
            public StringBuilder(String str)  带参构造
        StringBuilder的常见成员方法:
            append(任意类型) 添加数据
            reverse()       反转
            int length()   获取长度
            toString()  把StringBuilder容器转换成String

         */
        StringBuilder sb = new StringBuilder();
        System.out.println("---"+sb+"@@@");//---@@@

        //创建StringBuilder对象带参构造
        StringBuilder sb2 = new StringBuilder("abc");
        System.out.println(sb2);

        //添加数据
        sb2.append("aaa");
        System.out.println(sb2);

        //反转
        sb2.reverse();
        System.out.println(sb2);


        //变回字符串
        String s = sb2.toString();
        System.out.println(s);



    }
}
