package com.itheima.object_and_objects03;

public class Test2 {
    /*
    创建两个Student对象,判断两个对象是否相等
    equals()
    this：所在方法调用则会的内存地址
     public boolean equals(Object obj) {
        return (this == obj);
    }
     */
    static void main(String[] args) {
        //1.创建两个对象
        Student s1 = new Student("张三",23);
        Student s2 = new Student("李四",24);
        Student s3 = new Student("张三",23);
        //2.比较两个对象是否相等
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));//false

        //3.判断对象是否相等,必须重写equals()方法
        //equals():比较对象时会重写,比较对象属性值是否相同
//        改写后变成了true
    }
}
