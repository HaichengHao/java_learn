package com.itheima.ooptest2;

public class Test {
    public static void main(String[] args) {
        /*
        现在有三个电子设备，设计它们的继承结构
        安卓手机:
            属性：品牌、价格
            行为:打电话、发短信、nfc
        苹果手机:
            属性：品牌、价格
            行为:打电话、发短信
        笔记本电脑:
            属性:品牌、价格
            行为:编程
         */
        Android a1 = new Android();
        a1.brand = "魅族";
        a1.price = 1999;
        System.out.println(a1.brand);
        System.out.println(a1.price);
        a1.call();
        a1.sendMessage();
        a1.NFC();

        //创建苹果手机对象
        Ios i1 = new Ios();
        i1.brand = "Iphone18";
        i1.price = 9999;
        System.out.println(i1.brand);
        System.out.println(i1.price);
        i1.call();
        i1.sendMessage();

        //创建笔记本电脑的对象
        LapTop l1 = new LapTop();
        l1.brand = "MacBook Pro";
        l1.price = 19999;
        System.out.println(l1.brand);
        System.out.println(l1.price);
        l1.coding();

    }
}
