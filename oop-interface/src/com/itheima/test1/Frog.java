package com.itheima.test1;

public class Frog extends Animal implements Swim{ //继承Animal类,实现Swim接口
    public Frog() {
    }

    public Frog(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("青蛙在蛙泳");
    }
}
