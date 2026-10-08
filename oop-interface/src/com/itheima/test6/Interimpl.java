package com.itheima.test6;

public class Interimpl implements Inter{
/*
虚放发表
非static非final,非private
只有虚方法表里面的方法才能够被重写,方法重写的实际意义就是替换了虚方法表中记录方法的内存地址
 */


//    @Override 不能写了
//    此时相当于接口和实现类里面刚好有两个方法重名了
    public static void method(){
        System.out.println("接口中的静态方法");
    }
}
