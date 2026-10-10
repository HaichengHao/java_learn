package com.itheima.a04stringbuilder;

import java.util.Random;

/*
定义一个字符串,打乱其中的内容
注意
字符串本身是不可变的，所以要将其转换成字符数组
 */
public class Test6 {
    static void main(String[] args) {
        String str = "abcd";
        char[] arr = str.toCharArray();//转换成字符数组

        //打乱字符数组arr中的内容
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //获取一个随机的索引
            int randomindex = r.nextInt(arr.length);
            //依次得到数组中每一个字符,跟随机索引上的字符进行位置交换

            char temp = arr[i];
            arr[i] = arr[randomindex];
            arr[randomindex] = temp;
        }

        //把打乱后的字符数组转换成字符串
        String newStr = new String(arr);
        System.out.println(newStr);

    }
}
