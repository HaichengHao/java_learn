package com.itheima.bigdecimaltest06;

import java.math.BigDecimal;

public class Test2 {
    static void main(String[] args) {
        /*
        BigDecimal常见成员方法
        public BigDecimal add(BigDecimal val)  加法
        public BigDecimal subtract(BigDecimal val)  减法
        public BigDecimal multiply(BigDecimal val)  乘法
        public BigDecimal divide(BigDecimal val)  除法
        public BigDecimal divideAndRemainder(BigDecimal val)  除法并返回余数

        public boolean equals(Object obj)  判断两个对象是否相等
        public BigDecimal pwor(int n)  求次方
        public BigDecimal max/min(BigDecimal val)  最大值/最小值

         */

        //1.获取对象
        BigDecimal b1 = new BigDecimal("100.0");
        BigDecimal b2 = new BigDecimal("10.0");

        BigDecimal b3 = b1.add(b2);
        System.out.println(b3);

        BigDecimal b4 = b1.subtract(b2);
        System.out.println(b4);

        BigDecimal b5 = b1.multiply(b2);
        System.out.println(b5);

        //除法❗❗❗想要精确运算的话不建议使用这个
        BigDecimal b6 = b1.divide(b2);
        System.out.println(b6);


        //获取商和余数
        BigDecimal[] b7 = b1.divideAndRemainder(b2);
        System.out.println(b7[0]);//10
        System.out.println(b7[1]);//0.0

        //需求,如果不想看商和余数,就想看整个结果33.33
        //默认保留小数点后2位
        BigDecimal b8 = b1.divide(b2, 2, BigDecimal.ROUND_HALF_UP);
        System.out.println(b8);//10.00




    }
}
