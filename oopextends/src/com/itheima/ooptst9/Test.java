package com.itheima.ooptst9;

public class Test {
    public static void main(String[] args) {
        //创建对象
        BechelorStudent bs = new BechelorStudent("张三",18,"本科一年级");
        System.out.println(bs.getName()+","+bs.getAge()+","+bs.getGrade());
        bs.eat();
        bs.study();
        bs.sleep();
    }
}
