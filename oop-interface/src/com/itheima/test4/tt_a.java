package com.itheima.test4;

public class tt_a extends Athlete implements speakineng{
    public tt_a() {
    }
    public tt_a(String name, int age) {
        super(name, age);
    }
    @Override
    public void study() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员会讲英文");
    }
}
