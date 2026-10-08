package com.itheima.ooptst10;

public class test {
    static void main(String[] args) {
        Manager m1 = new Manager("张三","M001",10000,2000);
        System.out.println(m1.getName()+","+m1.getE_id()+","+m1.getSalary()+","+m1.getBonus());
        m1.work();
        Chef c1 = new Chef("李四","C001",15000);
        System.out.println(c1.getName()+","+c1.getE_id()+","+c1.getSalary());
        c1.work();
    }
}
