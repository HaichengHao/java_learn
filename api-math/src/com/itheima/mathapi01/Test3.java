package com.itheima.mathapi01;

import java.util.Scanner;

/*
自幂数,一个n位自然数等于自身各个数位上数字的n次幂之和
eg: 153 = 1^3 + 5^3 + 3^3
1. 获取一个数,比如153
2. 获取这个数的位数,比如153是3位
3. 获取这个数各个数位上的数字,比如153的个位是1,十位是5,百位是3
4. 获取这个数各个数位上的数字的n次幂之和,比如1^3 + 5^3 + 3^3
5. 判断这个数是否是自幂数
 */
public class Test3 {
    static void main(String[] args) {
        //1.获取输入的正数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int num = sc.nextInt();//123
        //2.获取到num上的每一位
        //获取到num最右边的数字lastNumber = num % 10 = 3
        //去掉3:num = 12
        //获取到num最右边的数字:lastNumber = num % 10 = 2
        //重复上面逻辑
        //获取到num最右边的数字:lastNumber = num % 10 = 1
        //去掉1:num = 0 --- 循环的结束条件

        while (num!=0){
            int lastNumber = num % 10;
            num /= 10;
            System.out.println(lastNumber);
            /*
            请输入一个正整数:
            123
            3
            2
            1

             */
        }




    }
    //定义一个方法判断数字是不是自幂数

}
