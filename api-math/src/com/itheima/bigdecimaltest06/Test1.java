package com.itheima.bigdecimaltest06;

import java.math.BigDecimal;

public class Test1 {
    static void main(String[] args) {
        /*
        两种方法，构造方法和静态方法
         */

        //1.利用构造方法获取对象
        char[] chars={'1','.','5'}; //1.5
        BigDecimal bd1 = new BigDecimal(chars);
        System.out.println(bd1);


        BigDecimal bd2 = new BigDecimal("1.5");
        System.out.println(bd2);


        //误区:
        //给构造方法传递一个double类型的小数(错误)
        //传递过来的数据就是不精确的，自然不会精确
//        BigDecimal bd3 = new BigDecimal(0.226);
//        System.out.println(bd3);//0.2260000000000000064392935428259079344570636749267578125


        //2.利用静态方法valueOf()获取对象
        //优化机制
        //0-10提前创建好，放入到数组当中
        BigDecimal bd4 = BigDecimal.valueOf(0.226);
        System.out.println(bd4);
    }
}
