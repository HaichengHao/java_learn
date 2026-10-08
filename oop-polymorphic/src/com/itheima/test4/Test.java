package com.itheima.test4;

public class Test {
    static void main(String[] args) {
        // 创建学生对象
        Student student = new Student("张三", 20);

        // 创建长方形对象
        Rectangle rect = new Rectangle(5.0, 3.0);
        // 创建圆形对象
        Circle circle = new Circle(4.0);

        // 学生使用长方形（多态调用）
        student.useShape(rect);

        // 学生使用圆形（多态调用）
        student.useShape(circle);
    }
}
