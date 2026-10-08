package com.itheima.test4;

public class Student {
    private String name;
    private int age;

    public Student(){

    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void useShape(Shape shape) {
        System.out.println("学生 " + name + "（" + age + "岁）正在使用图形：");
        System.out.println("图形信息： " + shape.getInfo());
        System.out.println("周长： " + String.format("%.2f", shape.getPerimeter()));
        System.out.println("面积： " + String.format("%.2f", shape.getArea()));
        System.out.println("--------------------");
    }
}
