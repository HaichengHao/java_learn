package com.itheima.bigintegertest05;

import java.math.BigInteger;

public class Test01 {
    static void main(String[] args) {
        //1.利用构造方法获取对象
        BigInteger b1 = new BigInteger("99999999999999999999999999999");
        System.out.println(b1);

        BigInteger b2 = new BigInteger("99999999999999999999999999999");
        System.out.println(b1==b2);//false  每new一次都是新的BigInteger对象

        //2.利用静态方法获取对象
        //当BigInteger加载到内存时，提前把-16-16之间的每一个数字都创建了对象，一共33个，放入数组当中
        //目的:跟Integer是一样的,当使用频率高的时候，节约内存
        //细节:如果要获取的数字比较大，超出了long的取值范围,此时只能用构造方法的方式
        //如果要获取的数字比较大，超出了long的取值范围,此时只能用构造方法的方式
        BigInteger bd3 = BigInteger.valueOf(10);
        BigInteger bd4 = BigInteger.valueOf(10);
        System.out.println(bd3 == bd4);//true
        // BigInteger类中有一个静态变量cache,保存了-16-16❗❗❗❗❗之间的对象,所以用valueOf()获取对象时,会判断这个对象是否在cache当中,
        // 如果在,就会返回这个对象,否则就会创建新的对象

        //3.直接赋值的方式,没有这种方式的
        //目前为止，只有包装类和String允许这样赋值
//        BigInteger bd5 = 100; BigInteger不允许这样赋值



    }
}
