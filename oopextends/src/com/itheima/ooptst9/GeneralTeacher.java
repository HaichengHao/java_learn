package com.itheima.ooptst9;

public class GeneralTeacher extends Teacher{
    public GeneralTeacher() {
    }

    public GeneralTeacher(String name, int age, String subject) {
        super(name, age, subject);
    }

    @Override
    public void teach() {
        System.out.println("通识课老师教授通识课");
    }
}
