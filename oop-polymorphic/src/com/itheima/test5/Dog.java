package com.itheima.test5;

public class Dog extends Animal{

    public Dog() {
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    void act() {
        System.out.println("狗看家");
    }
}
