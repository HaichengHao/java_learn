package com.itheima.ooptst7;

public class Test {
    static void main(String[] args) {
        /*
        根据下面的描述定义继承结构
        学生:
            属性:姓名、年龄、年级
        老师：
            属性：姓名、年龄、学科
         */
        Student stu1 = new Student("张三",12,"六年级");
        System.out.println("姓名:%s;年龄:%d;年级:%s".formatted(stu1.name,stu1.age,stu1.grade));

    }
}
