package com.itheima.integerTest04;

public class Test {
    static void main(String[] args) {
        //1.构造方法
        //每一次都会在内存中创建一个新的Integer的对象
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");//字符串类型
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i1==i2);//false


        //2.静态方法
        //当Integer类被加载到内存中的时候，会提前❗❗❗创建-128-127之间所有数据的对象，共计256个，放入到一个数组当中
        //当我们用valueof方法获取对象的时候,判断是否在这个范围当中,如果在此范围内，就会是true,否则是false
        //如果在，就不会创建新的对象,而是从数组当中获取
        //如果不在,此时就会利用构造方法的方式去创建对象
        Integer i3 = Integer.valueOf(127); //超出范围则为false,可以试试128
        Integer i4 = Integer.valueOf("127");
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i3==i4);//false

        //3.直接赋值
        Integer i5 = 127;
        Integer i6 = 127;
        System.out.println(i5==i6);//true
    }
}
