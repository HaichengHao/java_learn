package com.itheima.ooptst8;

public class Student {
//    String name="同学";
//    int age=18;
    String name;
    int age;

    public Student(){
        //或者上面不写默认值而在下面这里用this声明
        this("同学",18);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
