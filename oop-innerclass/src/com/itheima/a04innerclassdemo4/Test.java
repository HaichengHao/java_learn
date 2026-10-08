package com.itheima.a04innerclassdemo4;

public class Test {
    static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.show();
    }
}
