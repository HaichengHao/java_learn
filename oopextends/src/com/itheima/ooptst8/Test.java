package com.itheima.ooptst8;

public class Test {
    static void main(String[] args) {
        /*
        this():调用本类的其它构造方法
        细节:
            1.如果子类中有多个构造方法的时候，不能用this互动调用，一定要预留一个调用
            2.如果构造方法当中写上了this(),就不能再写super(),JVM也不会自动添加super()
            3.this()和super()必须放在第一行(老版本jdk1.8之前,jk1.8之后可以不放在第一行)
         */
        Student stu = new Student();
        System.out.println(stu.name+","+stu.age+"岁");
    }
}
