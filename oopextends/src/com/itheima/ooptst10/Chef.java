package com.itheima.ooptst10;

public class Chef extends Employee{
    public Chef() {
    }

    public Chef(String name, String e_id, double salary) {
        super(name, e_id, salary);
    }

    @Override
    public void work() {
        System.out.println("厨师正在炒菜");
    }
}
