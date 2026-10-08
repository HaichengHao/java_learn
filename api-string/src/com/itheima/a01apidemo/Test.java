package com.itheima.a01apidemo;

import java.util.Random;

/*
在什么情况下,不需要导包?
1.当前类和要使用的类在同一个包下
2.如果使用java.lang(核心)包下的类
 */
public class Test {
    static void main(String[] args) {
        //1.创建Random的对象
        Random r = new Random();
        System.out.println(r.nextInt(1,10));

        //2.调用nextDouble方法,生成一个随机小数(0.0-1.0)
        System.out.println(r.nextDouble());

        //3.调用nextDouble(bound)方法,生成一个随机小数[0.0-bound)
        System.out.println(r.nextDouble(1.9));

        //4.调用nextDouble(origin, bound)方法,生成一个随机小数[origin, bound)
        System.out.println(r.nextDouble(1.5,2.7));

    }
}
