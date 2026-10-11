package com.itheima.bigintegertest05;

import java.math.BigInteger;

public class Test02 {
    static void main(String[] args) {
        /*
        BigInteger常见成员方法
        public BigInteger add(BigInteger val)  加法
        public BigInteger subtract(BigInteger val)  减法
        public BigInteger multiply(BigInteger val)  乘法
        public BigInteger divide(BigInteger val)  除法
        public BigInteger mod(BigInteger m)  取余
        public BigInteger divideAndRemainder(BigInteger val)  除法并返回余数
        public boolean  equals(Object x)  判断两个对象是否相等
        public BigInteger pow(int n)  求幂
        public BigInteger nax/min(BigInteger val)   获取最大值/最小值
         */


        BigInteger b1 = BigInteger.valueOf(100);
        BigInteger b2 = BigInteger.valueOf(2);
        BigInteger b3 = BigInteger.valueOf(3);

        //加法
        //细节:在进行计算的时候，不会影响原来的值,而是产生了一个新的对象
        System.out.println(b1.add(b2));

        //减法
        System.out.println(b1.subtract(b2));

        //乘法
        System.out.println(b1.multiply(b2));


        //除法
        System.out.println(b1.divide(b2));


        //取余
        BigInteger[] arr = b1.divideAndRemainder(b3);
        System.out.println(arr.length);//2，数组的第一位是整数，第二位是余数
        System.out.println(arr[0]);//33
        System.out.println(arr[1]);//1


        //比较
        boolean b = b1.equals(b2);
        System.out.println(b);//false

        //pow
        BigInteger b7 = b1.pow(2); //100的2次方
        System.out.println(b7);//10000


        //max和min
        BigInteger b8 = b1.max(b2);//比较两个对象，返回较大的对象
        System.out.println(b8);//100



    }
}
