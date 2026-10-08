package com.itheima.a03stringdemo;

import java.util.Scanner;

public class Test {
    static void main(String[] args) {
        /*
        boolean equals方法(要比较的字符串)  完全一样结果才是true,否则为false
        boolean equalsIgnoreCase(要比较的字符串)  忽略大小写的比较

        练习:
            已知正确的用户名和密码,请用程序实现模拟用户登录
            总共给三次机会,登录之后,给出相应的提示

         */
        //字符串比较

        String s1 = "hahah";
        String s2 = "hahah";

        boolean result = s1.equals(s2);
        System.out.println(result);  //true

        String s3 = "Hahah";
        boolean result2 = s1.equalsIgnoreCase(s3); //忽略大小写的比较

        System.out.println(result2);//true


        //联系
        String username = "niko";
        String pwd = "1233abc.";




        for(int i = 0 ;i<3;i++){
            Scanner sc  = new Scanner(System.in);
            System.out.println("请输入用户名:");

            String u_name = sc.next();

            System.out.println("请输入密码:");
            String u_pwd = sc.next();
            if(username.equals(u_name) && pwd.equals(u_pwd)){
                System.out.println("登录成功");
                break;
            }else{

                int count = 2-i;
                if(count!=0){
                System.out.println("用户名或密码错误,请重新输入");
                System.out.println("登录失败,剩余机会%d次".formatted(2-i));
                }else {
                    System.out.println("登录失败,已无登录机会，请联系管理员");
                }
            }
        }

    }
}
