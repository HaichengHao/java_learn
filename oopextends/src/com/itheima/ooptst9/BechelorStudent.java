package com.itheima.ooptst9;

public class BechelorStudent extends Student{

    public BechelorStudent() {
    }

    public BechelorStudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    @Override
    public void study(){
        System.out.println("本科生攻读本科内容");
    }

}
