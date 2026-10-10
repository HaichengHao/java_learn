package com.itheima.apimath01;

public class Test01 {
    static void main(String[] args) {
        //1.不能创建Math类的对象

        //abs获取绝对值
        int num1 = Math.abs(10);
        System.out.println(num1);

        //ceil向上取整,和python一样
        System.out.println(Math.ceil(10.11));
        System.out.println(Math.ceil(10.61));
        /*
        10
        11.0
        11.0
         */

        //floor 向下取整
        System.out.println(Math.floor(10.11));
        System.out.println(Math.floor(10.61));


        //round() 四舍五入
        System.out.println(Math.round(10.51));
        System.out.println(Math.round(10.49));

        //但是负数也需要注意
        System.out.println(Math.round(-10.51));//-11
        System.out.println(Math.round(-10.49));//-10
        System.out.println(Math.round(-10.5));//-10  如果负数的小数位刚好是0.5的时候,采取舍去操作
        //round规则:返回与参数最接近的整数,如果有多个则返回正无穷大方向

        //---（-2）----（-1））----（0）----（1）----（2）



        //max() 获取两个数中的最大值
        System.out.println(Math.max(10, 20));
        System.out.println(Math.max(10.1, 20.1));

        //min() 获取两个数中的最小值
        System.out.println(Math.min(10, 20));
        System.out.println(Math.min(10.1, 20.1));

        //pow() 获取一个数的幂
        System.out.println(Math.pow(2, 3));

        //sqrt() 获取一个数的平方根
        System.out.println(Math.sqrt(9));


        //cbrt() 获取一个数的立方根
        System.out.println(Math.cbrt(8));

        //random() 获取随机数,不常用,还是之前的Random rd = new Random();更常用
        System.out.println(Math.random());

    }
}
