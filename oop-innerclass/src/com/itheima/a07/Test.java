package com.itheima.a07;

public class Test {
    static void main(String[] args) {
        //在测试类中调用下面的goSwimming方法
//
//        Student stu = new Student();
//        goSwimming(stu);


        //匿名内部类
        Swim s = new Swim(){
            @Override
            public void swim() {
                System.out.println("学生正在游泳");
            }
        };


        //相当于新建了一个Swim()对象,然后{}内部重写了这个接口的方法

        goSwimming(s);


    }


    //调用这个方法的时候，需要传递Swim这个接口的实现类对象
    public static void goSwimming(Swim s){
        s.swim();
    }
}
