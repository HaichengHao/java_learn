package com.itheima.a03stringdemo;

import java.util.Scanner;

public class Test8 {
    static void main(String[] args) {
        /*
        String replace(旧值,新值)替换
        注意点:只有返回值才是替换之后的结果
         */

        String s1 = "傻站在你家楼下抬起头数乌云";
        String s2 = s1.replace("傻","呆呆");
        System.out.println(s2);//呆呆站在你家楼下抬起头数乌云


        //1.定义一个敏感词库
        String[] arr = {"傻", "傻d", "傻b","tmd"};

        //2.键盘录入你说的话
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想说的话:");
        String msg = sc.next();

        //3.替换敏感词
        for(int i = 0;i<arr.length;i++){
            msg = msg.replace(arr[i],"***" );

        }

        System.out.println(msg);


    }
}
