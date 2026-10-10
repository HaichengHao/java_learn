package com.itheima.apimath01;

import java.util.Scanner;

public class Test2 {
    static void main(String[] args) {

        //输入
        Scanner sc = new Scanner(System.in);
        System.out.println("输入数字:");
        int num = sc.nextInt();

        isPrime(num);


    }

    //定义一个方法,判断一个数是否为一个质数
    public static void isPrime(int num){

        //只要从2开始，一直循环到平方根即可
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("非质数");
                return;
            }
        }
        System.out.println("质数");
    }
}
