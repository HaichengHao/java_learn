package com.itheima.variable1;

public class Variable {
    static void main(String[] args) {
        /*
        微信 0
        支付宝 10
        银行卡 20
        问题1：现在一共有多少钱
        问题2：微信收了10元红包，又发了2元红包，余额多少
         */

        double wechat = 0;
        double alipay = 10;
        double bank = 20;
        double total = wechat + alipay + bank;
        System.out.println("现在一共有多少钱：" + total);
        wechat = wechat + 10 - 2;
        System.out.println("微信余额：" + wechat);
        System.out.println("支付宝余额：" + alipay);
        System.out.println("银行卡余额：" + bank);
        System.out.println("当前总余额: "+ (wechat+alipay+bank));

    }
}
