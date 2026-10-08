package com.itheima.test7;

public interface Inter {
    public default void login() {
        check();
        System.out.println("执行登录的逻辑");
    }


    public default void register() {
        check();
        System.out.println("执行注册的逻辑");
    }


    //jdk9之后新增私有方法

    private void check() {
        System.out.println("检查网络");
        System.out.println("检查用户名和密码的格式");
        System.out.println("检查用户名是否存在");
    }
}
