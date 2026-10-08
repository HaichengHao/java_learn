package com.itheima.a05innerclassdemo5;

public class Test {
    /*
    注意事项
    1.静态内部类也是成员内部类中的一种
    2.静态内部类只能访问外部类中的静态变量和静态方法
    如果想要访问非静态的需要创建对象

    创建静态内部类对象的格式
        外部类名.内部类名 对象名 = new 外部类名.内部类名();
    调用静态方法的格式
        外部类名.内部类名.静态方法名();
     */
    static void main(String[] args) {

        //非静态方法，先创建对象，用对象调用
        Outer.Inner oi = new Outer.Inner();  //注意这是静态内部类写法,非静态是值卡的那种new Outer().new Inner();
        oi.show1();

        Outer.Inner.show2();  //静态方法调用格式
    }
}
