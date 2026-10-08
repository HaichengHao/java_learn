package com.itheima.test1;

public class StudentManager {

    //定义一个方法表示注册用户
    //参数Person,此时可以传递Person本身的对象,同时也可以传递Person所有的子类对象
    public void register(Person person){
        System.out.println("姓名为"+person.getName()+"的账户"+person.getUsername()+"注册成功");
        person.work();
    }
}
