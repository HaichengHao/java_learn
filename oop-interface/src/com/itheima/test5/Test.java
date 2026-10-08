package com.itheima.test5;

public class Test {
    static void main(String[] args) {
        /*
        接口中的默认方法:
            作用:为了接口升级而存在的
            格式:public default 返回值 方法名(参数列表){}

            注意事项:
                1.默认方法不是抽象方法,所以不强制重写。但是如果重写，要去掉default关键字
                2.public可以省略,default不能省略
                3.如果实现了多个接口,多个接口中存在相同名字的默认方法,那么子类必须重写这个方法
         */

        //创建实现类的方法,并调用默认方法
        Interimpl ii = new Interimpl();
        ii.function();
    }
}
