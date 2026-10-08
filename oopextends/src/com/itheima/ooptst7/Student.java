package com.itheima.ooptst7;

public class Student extends Person{
    String grade;
    //构造方法
    //1.空参构造
    public Student(){
        System.out.println("子类student的空参构造执行了");
    }
    //2.带全部参数的构造
    //父类中的属性：通过super的形式传递给父类的构造方法赋值
    //子类中的属性:自己赋值
    public Student(String name, int age, String grade) {
        //父类中的属性，通过super(参数)形式传递给父类的构造方法赋值
        super(name, age);
        //子类中的属性，自己赋值
        this.grade = grade;
        System.out.println("子类student的带参构造执行了");
    }
}
