package com.itheima.test1;

public class Test {
    static void main(String[] args) {
        //创建一个学生类的对象
        Student stu1 = new Student("张三","葬爱123","123456");
        StudentManager sm = new StudentManager();
        sm.register(stu1);


        //创建一个老师的对象
        Teacher t1 = new Teacher("李四","kill123","abcdefg");
        sm.register(t1);

        //创建一个管理员
        Admin a1 = new Admin("王五","admin123","123456");
        sm.register(a1);
    }
}
