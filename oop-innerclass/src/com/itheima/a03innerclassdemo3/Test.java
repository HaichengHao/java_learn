package com.itheima.a03innerclassdemo3;

public class Test {
    static void main(String[] args) {
        Outer.Inner1 oi = new Outer().new Inner1();

        Outer o = new Outer();
        Object oi2 = o.getInner2();
    }
}
