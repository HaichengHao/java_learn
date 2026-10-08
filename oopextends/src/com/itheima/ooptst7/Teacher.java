package com.itheima.ooptst7;

public class Teacher extends Person{
    String subject;

    //空参构造方法
    public Teacher() {
        System.out.println("子类Teacher的空参构造执行了");
    }
    //有参构造方法
    public Teacher(String name, int age, String subject) {
        //父类中的属性，通过super(参数)形式传递给父类的构造方法赋值
        super(name, age);
        //子类中的属性，自己赋值
        this.subject = subject;
        System.out.println("子类Teacher的有参构造执行了");
    }
}
