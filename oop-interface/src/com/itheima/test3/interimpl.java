package com.itheima.test3;

public class interimpl extends Person implements Inter1,inter2{
    //important:类跟接口之间是实现关系，可以是单实现，也可以是多实现，还可以在继承一个类的同时实现多个接口
//       注意点: 1.如果父类Person也是一个抽象类的话，那么子类必须把所有的抽象方法进行重写，要么子类本身也是一个抽象类
//              2.如果多个接口当中出现重复的抽象方法，那么重写一次就行了
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void function1() {

    }

    @Override
    public void function2() {

    }

    @Override
    public void aaa() {

    }
}
