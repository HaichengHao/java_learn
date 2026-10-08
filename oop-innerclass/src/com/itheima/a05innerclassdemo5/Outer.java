package com.itheima.a05innerclassdemo5;

public class Outer {

    static class Inner{  //static修饰的静态内部类
        public void show1(){//非静态方法
            System.out.println("非静态方法被调用了");
        }

        public static void show2(){  //静态方法
            System.out.println("静态方法被调用了");
        }
    }
}
