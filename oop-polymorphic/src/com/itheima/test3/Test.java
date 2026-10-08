package com.itheima.test3;

public class Test {
    static void main(String[] args) {
        Person p = new Person("张三",18,"男");
        p.drive(new Car("三菱",180));
        p.drive(new Bicycle("凤凰",20));
    }
}
