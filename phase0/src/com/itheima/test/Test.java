package com.itheima.test;

import java.util.Scanner;

public class Test {
    static void main(String[] args) {
        /*
        彩票中奖案例,生成一个七位数的随机数表示彩票号码,键盘录入一个七位数表示用户购买的彩票，
        判断用户输入的彩票号码是否和系统生成的是否一致
        */

//        1生成七位数表示彩票号码
        int lottery = (int)(Math.random() * 9000000 + 1000000);
//        2键盘录入一个七位数表示用户购买的彩票
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个七位数表示用户购买的彩票：");
        int number = sc.nextInt();
//        3判断用户输入的彩票号码是否和系统生成的是否一致
        if (number == lottery) {
            System.out.println("中奖了");
        } else {
            System.out.println("未中奖");
        }
    }
}
