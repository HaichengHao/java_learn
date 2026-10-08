package com.itheima.test4;

abstract class Shape {

    //定义抽象方法,不写具体实现的方法体
    // 计算周长
    public abstract double getPerimeter();

    // 计算面积
    public abstract double getArea();


    //定义具体方法

    // 图形信息的描述（可选，方便打印）
    public String getInfo() {
        return "这是一个图形";
    }
}
