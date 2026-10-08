package com.itheima.test5;

public class Interimpl implements InterA,InterB {
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void function() {
//        InterA.super.function();
        System.out.println("重写接口中的function方法");
    }

}
