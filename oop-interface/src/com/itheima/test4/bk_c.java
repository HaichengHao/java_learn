package com.itheima.test4;

public class bk_c extends Coach{
    public bk_c() {
    }

    public bk_c(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教篮球");
    }
}
