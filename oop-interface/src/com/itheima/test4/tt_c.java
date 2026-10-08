package com.itheima.test4;

public class tt_c extends Coach implements speakineng{
    public tt_c() {
    }

    public tt_c(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练会讲英文");
    }
}
