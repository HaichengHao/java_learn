package com.itheima.a02innerclassdemo2;

public class Test {
    static void main(String[] args) {
        //非私有的直接创建对象
        Outer.Inner1 oi = new Outer().new Inner1();


        //私有的先在外部类编写方法，对外提供内部类对象,譬如下面这个getInner2()
        Outer o = new Outer();
        Object oi2 = o.getInner2();
    }
}
