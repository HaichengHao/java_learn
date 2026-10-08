package com.itheima.ooptst9;

public class MasterStudent extends Student{
    public MasterStudent() {
    }

    public MasterStudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    @Override
    public void study() {
        System.out.println("硕士研究生攻读硕士内容");
    }

    @Override
    public void sleep() {
        System.out.println("研究生住宿条件升级，入住优质宿舍");
    }
}
