package com.itheima.a01innerclassdemo1;


//内部类
//写在一个类里面的类就叫做内部类
/*
什么时候使用内部类
一个类表示的事务是另一个类的一部分，且单独存在没有意义
比如:汽车的发动机，人的心脏等
 */
public class Car {
    String carBrand;
    int carAge;
    String carColor;


    //发动机，它是一个成员内部类，写在类中，方法外,它和成员变量的地位是一样的，可以被一些修饰符修饰
//    比如private,protected,public,static,final,abstract等
//    在成员内部类里面，JDK16之前不能定义静态变量，JDK16开始彩可以定义静态变量
    class Engine{
        String engineBrand;
        int engineAge;
    }

    public void run(){
        Engine engine = new Engine();
        System.out.println(engine.engineBrand);
        System.out.println(engine.engineAge);
    }

}
