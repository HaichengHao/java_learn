package com.itheima.ooptst10;

public class Manager extends Employee{
    private double bonus;

    public Manager() {

    }

    public Manager(String name, String e_id, double salary, double bonus) {
        super(name, e_id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理正在管理其余员工");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
