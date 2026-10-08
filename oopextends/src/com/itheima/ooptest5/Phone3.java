package com.itheima.ooptest5;

public class Phone3 extends Phone2{

    //重写父类Phone2的方法
    @Override  // 注解，它是给JVM看的，告诉JVM，这个方法，是重写父类的方法
    public void calling(){
        System.out.println("视频通话");
    }
    public void Game(){
        System.out.println("打游戏");
    }
}
