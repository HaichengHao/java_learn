package com.itheima.ooptst7;

public class Person {
    String name;
    int age;

    //构造方法
    //空参构造
    public Person() {
        System.out.println("父类的空参构造执行了");
    }
    //带参构造
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("父类带参构造执行了");
    }
}
