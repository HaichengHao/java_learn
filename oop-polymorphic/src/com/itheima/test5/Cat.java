package com.itheima.test5;

class Cat extends Animal{

    public Cat() {
    }

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    void act() {
        System.out.println("猫抓老鼠");
    }

}
