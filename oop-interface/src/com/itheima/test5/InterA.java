package com.itheima.test5;

public interface InterA {
    public abstract void method1();
    public abstract void method2();

    //新增默认方法
    public default void function(){
        System.out.println("InterA接口当中新增的默认方法");
    }
}

