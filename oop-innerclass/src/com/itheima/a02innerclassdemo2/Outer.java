package com.itheima.a02innerclassdemo2;

public class Outer {

    public class Inner1{

    }

    private class Inner2{

    }

    public Inner2 getInner2(){
        return new Inner2();
    }
}
