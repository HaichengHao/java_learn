package com.itheima.test6;

public class Test1 {
    /*
    接口中的静态方法
        作用:为了接口升级而存在的
        格式:public static 返回值 方法名(参数列表){}

        注意事项:
        1.静态方法只能通过接口名调用，不能通过实现类名或者对象名调用
        2.public可以省略,static不能省略
     */
    static void main(String[] args) {
        //只能通过接口名调用
        Inter.method();

        //不能通过实现类名或者对象名调用
//        Interimpl ii = new Interimpl();
//        ii.method()  这样写会报错

    }
}
