package com.itheima.ooptest3;

public class Zi extends Fu {
    String name="Zi";
    public void ziShow(){
        String name = "ziShow";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
//this调用的是本类中的属性
//super调用的是父类中的属性