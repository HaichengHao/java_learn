package com.itheima.test5;

abstract class Animal {
    private String name;
    private String color;

    //定义抽象方法
    abstract void eat();
    abstract void act();

    //定义具体方法
    public void drink(){
        System.out.println("喝水");
    }

    //定义构造方法
    public Animal(){

    }
    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    //定义setter和getter方法


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
