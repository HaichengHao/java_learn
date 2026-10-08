package com.itheima.test4;

public class bk_a extends Athlete{
    public bk_a() {
    }
    public bk_a(String name, int age) {
        super(name, age);
    }
    @Override
    public void study() {
        System.out.println("学打篮球");
    }
}
