package com.itheima.test5;

public interface InterB {
    public default void function(){
        System.out.println("InterB接口当中新增的默认方法");
    }
}
