package com.itheima.mathapi01;

import java.util.Scanner;

/*
自幂数,一个n位自然数等于自身各个数位上数字的n次幂之和
eg: 153 = 1^3 + 5^3 + 3^3
    1234 = 1^4 + 2^4 + 3^4 + 4^4
1. 获取一个数,比如153
2. 获取这个数的位数,比如153是3位
3. 获取这个数各个数位上的数字,比如153的个位是1,十位是5,百位是3
4. 获取这个数各个数位上的数字的n次幂之和,比如1^3 + 5^3 + 3^3
5. 判断这个数是否是自幂数
 */
public class Test4 {
    static void main(String[] args) {
        //1.获取输入的正数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int num = sc.nextInt();//123

        //定义一个第三方变量去记录num的值
        int temp = num;
        //2.把num看作一个字符串,字符串的长度就是数字的位数❗❗❗❗❗
        int len = (num + "").length();
        //获取到num最右边的数字lastNumber = num % 10 = 3
        //去掉3:num = 12
        //获取到num最右边的数字:lastNumber = num % 10 = 2
        //重复上面逻辑
        //获取到num最右边的数字:lastNumber = num % 10 = 1
        //去掉1:num = 0 --- 循环的结束条件


        //定义一个求和变量，用于进行累加
        int sum = 0;
        while (num!=0){
            int lastNumber = num % 10;
            //去掉右边的数字
            num /= 10;
            //求lastNumber的N次幂,并进行累加
            //注意,pow返回值是double类型,而sum是int类型,所以需要强转
            sum += (int) Math.pow(lastNumber, len);


        }


        System.out.println(sum);
        System.out.println(num);

        //判断
        if(sum == num){
            System.out.println("自幂数");
        }else {
            System.out.println("不是自幂数");
        }






    }

}
